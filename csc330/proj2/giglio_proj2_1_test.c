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

  //printf("I work!\n");
  printWelcome();

  free(head);
  free(tail);

  return 0;
}
