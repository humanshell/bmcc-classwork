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
  // and initial menu
  printWelcome();
  int choice = printMenu();
  elem e;

  // print menu in a loop until user decides to stop
  while (choice) {
    switch (choice) {
      case 1:
        choice = printMenu();
        break;
      case 2:
        printf("Enter ONE element to be inserted into the list: ");
        scanf("%d", &e);
        insertOne(e, head);
        choice = printMenu();
        break;
      case 3:
        if (isEmpty(head))
          printf("\nYes, the list is empty.\n");
        else
          printf("\nNo, the list is not empty.\n");
        choice = printMenu();
        break;
      case 4:
        printf("\nGoodbye!\n");
        choice = 0;
        break;
      default:
        printf("\nThat was not a valid selection. I'm out!\n");
        choice = 0;
        break;
    }
  }

  free(head);
  free(tail);

  return 0;
}
