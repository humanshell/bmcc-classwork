#include <string.h>
#include <ncurses.h>
#include "giglio_proj2_1.h"

// function declarations (prototypes)
void print_menu(WINDOW *, int);

// global variables
char *choices[] = {
                    "Print the list",
                    "Insert an element into the list",
                    "Remove an element from the list",
                    "Remove all elements from the list",
                    "Find an element in the list",
                    "Check if the list is empty",
                    "Count the number of elements in the list",
                    "Exit",
                  };

int n_choices = sizeof(choices) / sizeof(char *);
int stdscr_rows, stdscr_cols, menu_win_rows, menu_win_cols;

// this is where the magic happens
int main(int argc, const char *argv[]) {
  WINDOW *menu_win;
  int ch, highlight = 1;
  char directions[] = "Use arrow keys to navigate, press enter to select";

  // initialize the ncurses session
  initscr();
  clear();
  noecho();
  cbreak();
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
          case 2: /* insert one */
          case 3: /* remove one */
          case 4: /* remove all */
          case 5: /* find */
          case 6: /* check length */
          case 7: /* count elements */
            break;
          case 8: /* exit */
            endwin();
            return 0;
        }
    }

    print_menu(menu_win, highlight);
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

