#include <stdio.h>
#include "giglio_proj2_1.h"

// print a welcome message when program launches
void printWelcome() {
  printf("\nWelcome to Dominic's Circular Doubly Linked List example!\n\
Use the menu below to experimemt with all the different ways\n\
to create, alter and destroy linked lists. You will be able\n\
to continue using this menu until you choose to leave.\n\n"
  );
}

// print the menu used by the user to interact with the list
int printMenu() {
  int choice = 0;

  printf("\nPlease choose from the following options:\n\n\
1.) Insert a single element into the list\n\
2.) Check if the list is empty\n\
3.) Exit\n\n\
choice: "
  );

  // get the users choice
  scanf("%d", &choice);
  return choice;
}

// determine if the list is empty
int isEmpty(node *n) {
  int count = 1;
  node *cursor = n->next;

  while (cursor != n) {
    count++;
    cursor = cursor->next;
  }

  if (count > 2)
    return 0;
  else
    return 1;
}

