#include "giglio_proj2_1.h"

int main(int argc, const char *argv[]) {
  int e, choice;

  // create initial head and tail nodes
  node *head = (node *) malloc(sizeof(node));
  node *tail = (node *) malloc(sizeof(node));

  // bail if memory couldnt be allocated
  if (head == NULL || tail == NULL) {
    printf("Error allocating memory!\n");
    return EXIT_FAILURE;
  }

  // connect head and tail for a circular list
  // and initialize both data elements to -1
  head->next = head->prev = tail;
  tail->next = tail->prev = head;
  head->data = tail->data = -1;

  // print out welcome message and then start menu loop
  printWelcome();

  do {
    choice = printMenu();
    switch (choice) {
      case 1:
        if (isEmpty(head))
          printf("\n  This list appears to be empty!\n");
        else
          printList(head);
        break;
      case 2:
        printf("\nEnter ONE element to be inserted into the list: ");
        scanf("%d", &e);
        insertOne(e, head);
        break;
      case 3:
        if (isEmpty(head))
          printf("\n  Yes, the list is empty.\n");
        else
          printf("\n  No, the list is not empty.\n");
        break;
      case 4:
        printf("\n  List length: %d\n", lengthOf(head));
        break;
      case 5:
        printf("\n  Goodbye!\n");
        free(head);
        free(tail);
        return EXIT_SUCCESS;
      default:
        printf("\n  That was not a valid selection. I'm out!\n");
        free(head);
        free(tail);
        return EXIT_FAILURE;
    }
  } while (choice);
}

