#include <stdlib.h>
#include <stdio.h>
#include "giglio_proj2_1.h"

int main(int argc, const char *argv[]) {

  // create initial head and tail nodes
  node *head = (node *) malloc(sizeof(node));
  node *tail = (node *) malloc(sizeof(node));

  // bail if memory couldnt be allocated
  if (head == NULL || tail == NULL) {
    printf("Error allocating memory!\n");
    return EXIT_FAILURE;
  }

  // connect head and tail for circular list
  head->next = head->prev = tail;
  tail->next = tail->prev = head;

  // print out the welcome message
  printWelcome();

  // print out the menu in a while loop so user can continue
  // working with linked list until they wish to stop
  int choice;
  do {
    choice = printMenu();
    switch (choice) {
      case 1:
        choice = printMenu();
        break;
      case 2:
        printf("\nGoodbye!\n");
        break;
      default:
        printf("\nThat was not a valid selection. I'm out!\n");
        break;
    }
  } while (choice);

  free(head);
  free(tail);

  return 0;
}
