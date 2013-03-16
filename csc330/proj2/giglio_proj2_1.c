#include "giglio_proj2_1.h"

// print a welcome message when program launches
void printWelcome() {
  printf("\nWelcome to Dominic's Circular Doubly Linked List example!\n\
Use the menu below to experimemt with all the different ways\n\
to create, alter and destroy linked lists. You will be able\n\
to continue using this menu until you choose to leave.\n\n"
  );
}

// print each element to the screen
void printList(node *n) {
  node *cursor = n;
  elem start = cursor->data;

  if (isEmpty(n)) {
    printf("\n  This list appears to be empty!\n");
  } else {
    printf("\n  All list elements: ");

    while (cursor->data != start && cursor->data != NULL) {
      printf("%d ", cursor->data);
      cursor = cursor->next;
    }

    printf("\n");
  }
}

// insert one element into the list
void insertOne(elem e, node *n) {
  node *rightElem = n->next;  

  // if this is a new list with nothing in head, put e there
  // else, if this is a new list with nothing in tail, put e there
  // otherwise, create a new node and insert it into the list
  if (n->data == NULL) {
    n->data = (elem) e;
  } else if (n->prev->data == NULL) {
    n->prev->data = (elem) e;
  } else {
    node *newElem = (node *) malloc(sizeof(node));

    if (newElem == NULL) {
      printf("Error allocating memory!\n");
      return EXIT_FAILURE;
    }

    newElem->data = (elem) e;
    newElem->next = rightElem;
    newElem->prev = n;
    n->next = newElem;
    rightElem->prev = newElem;
  }
}

// print the menu used by the user to interact with the list
int printMenu() {
  int choice = 0;
  char *menu[4];

  menu[0] = "[1] Print the list";
  menu[1] = "[2] Insert a single element into the list";
  menu[2] = "[3] Check if the list is empty";
  menu[3] = "[4] Exit\n";

  printf("\nPlease choose from the following options:\n\n");
  while (choice < 4) printf("  %s\n", menu[choice++]);
  printf("choice: ");

  // get the users choice
  scanf("%d", &choice);
  return choice;
}

// determine if the list is empty
int isEmpty(node *n) {
  int count = 0;
  node *cursor = n;

  while (cursor->data != NULL) {
    count++;
    cursor = cursor->next;
  }

  if (count)
    return 0;

  return 1;
}

