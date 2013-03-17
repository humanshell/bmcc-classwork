#include "giglio_proj2_1.h"

// print a welcome message when program launches
void printWelcome() {
  printf("\nWelcome to Dominic's Circular Doubly Linked List example!\n\
This program allows you to create a list of positive integers.\n\
Use the menu below to experimemt with all the different ways\n\
to create, alter and destroy linked lists. You will be able\n\
to continue using this menu until you choose to leave.\n\n"
  );
}

// print each element to the screen
void printList(node *n) {
  node *cursor = n;

  printf("\n  All list elements: ");

  do {
    if (cursor->data != -1)
      printf("%d ", cursor->data);

    cursor = cursor->next;
  } while (cursor != n);

  printf("\n");
}

void deleteOne(int e, node *n) {

}

// print the menu used by the user to interact with the list
int printMenu() {
  int choice = 0;
  char *menu[5];

  menu[0] = "[1] Print the list";
  menu[1] = "[2] Insert a single element into the list";
  menu[2] = "[3] Check if the list is empty";
  menu[3] = "[4] Count the number of elements in the list";
  menu[4] = "[5] Exit\n";

  printf("\nPlease choose from the following options:\n\n");
  while (choice < 5) printf("  %s\n", menu[choice++]);
  printf("choice: ");

  // get the users choice
  scanf("%d", &choice);
  return choice;
}

// return the length of the list
int lengthOf(node *n) {
  int count = 0;
  node *cursor = n->next;
  
  if (n->data != -1)
    count++;

  while (cursor != n) {
    if (cursor->data != -1) count++;
    cursor = cursor->next;
  }

  return count;
}

// determine if the list is empty
int isEmpty(node *n) {
  if (lengthOf(n))
    return 0;
  else
    return 1;
}

// insert one element into the list
int insertOne(int e, node *n) {
  node *rightElem = n->next;  

  // if this is a new list with nothing in head, put e there
  // else, if this is a new list with nothing in tail, put e there
  // otherwise, create a new node and insert it into the list
  if (n->data == -1) {
    n->data = e;
  } else if (n->prev->data == -1) {
    n->prev->data = e;
  } else {
    node *newElem = (node *) malloc(sizeof(node));

    if (newElem == NULL) {
      printf("Error allocating memory!\n");
      return EXIT_FAILURE;
    }

    newElem->data = e;
    newElem->next = rightElem;
    newElem->prev = n;
    n->next = newElem;
    rightElem->prev = newElem;
  }

  return 1;
}

