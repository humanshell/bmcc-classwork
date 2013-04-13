#include <ncurses.h> /* ncurses.h includes stdio.h */ 
#include <string.h>
#include "giglio_proj2_1.h"

// function declarations (prototypes)
void print_menu(WINDOW *, int);

// global variables
char *choices[] = {
                    "Print the list",
                    "Insert an element into the list",
                    "Remove an element from the list",
                    "Remove each occurrence of an element",
                    "Remove all elements from the list",
                    "Find an element in the list",
                    "Count the number of elements in the list",
                    "Exit",
                  };

int n_choices = sizeof(choices) / sizeof(char *);
int stdscr_rows, stdscr_cols, menu_win_rows, menu_win_cols;

// this is where the magic happens
int main(int argc, const char *argv[]) {
  WINDOW *menu_win;
  int len, ch, highlight = 1;
  char directions[] = "Use arrow keys to navigate, press enter to select";
  char insert_message[] = "Enter the element you'd like to insert: ";
  char remove_message[] = "Enter the element you'd like to remove: ";

  // create a new node list
  list_t *node_list = new_list();

  // initialize the ncurses session
  initscr();
  clear();
  noecho();
  cbreak();
  curs_set(0);
  getmaxyx(stdscr, stdscr_rows, stdscr_cols);
  mvprintw(2, 2, "%s", directions);

  // initialize the menu window
  menu_win = newwin(12, 50, ((stdscr_rows - 12) / 2), ((stdscr_cols - 50) / 2));
  getmaxyx(menu_win, menu_win_rows, menu_win_cols);
  keypad(menu_win, TRUE);
  print_menu(menu_win, highlight);
  refresh();

  // enter continuous loop to let user use the menu
  while (1) {
    switch(ch = wgetch(menu_win)) {
      case KEY_UP:
        if (highlight == 1)
          highlight = n_choices;
        else
          --highlight;
        break;
      case KEY_DOWN:
        if (highlight == n_choices)
          highlight = 1;
        else
          ++highlight;
        break;
      case 10:
        switch (highlight) {
          case 1: /* print */
            if (node_list->len > 0) {
              len = node_list->len;
              mvprintw(stdscr_rows - 2, 2, "List elements:");
              clrtoeol();
              while (len--) {
                printw(" %s", node_list->curr->val);
                node_list->curr = node_list->curr->next;
              }
            } else {
              mvprintw(stdscr_rows - 2, 2, "The list is empty");
              clrtoeol();
            }
            break;
          case 2: /* insert one */
            echo();
            curs_set(1);
            mvprintw(stdscr_rows - 2, 2, "%s", insert_message);
            clrtoeol();
            move(stdscr_rows - 2, (strlen(insert_message) + 2));
            char *tmp_str = malloc(sizeof(char *));
            getstr(tmp_str);
            list_insert(node_list, new_node(tmp_str));
            mvprintw(stdscr_rows - 2, 2, "Element Inserted!");
            clrtoeol();
            curs_set(0);
            noecho();
            break;
          case 3: /* remove one */
          case 4: /* remove each */
          case 5: /* remove all */
          case 6: /* find */
            break;
          case 7: /* count elements */
            mvprintw(stdscr_rows - 2, 2, "List length: %d", node_list->len);
            clrtoeol();
            break;
          case 8: /* exit */
            free(tmp_str);
            destroy_list(node_list);
            endwin();
            return 0;
        }
    }

    print_menu(menu_win, highlight);
    refresh();
  }
} /* end main() */

// this function prints the main menu in the passed window
void print_menu(WINDOW *menu_win, int highlight) {
  int x, y, i;

  box(menu_win, 0, 0);

  for (i = 0, x = y = 2; i < n_choices; i++, y++) {
    if (highlight == i + 1) {
      wattron(menu_win, A_REVERSE);
      mvwprintw(menu_win, y, x, "[*] %s", choices[i]);
      wattroff(menu_win, A_REVERSE);
    } else {
      mvwprintw(menu_win, y, x, "[]  %s", choices[i]);
    }
  }
} /* end print_menu() */

