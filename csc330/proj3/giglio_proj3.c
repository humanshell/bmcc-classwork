#include <stdio.h>
#include <string.h>
#include "gstack.h"

int main(void) {
  char infx[100];

  // ask the user for their expression
  printf("Enter an expression and press return: \n");
  fgets(infx, 100, stdin);
  printf("You entered the expression: \n");
  for (int i = 0, len = strlen(infx) - 1; i < len; i++) {
    printf("%c", infx[i]);
  }
  printf("\n");
  printf("Length of infx: %d\n", strlen(infx) - 1);
  printf("\n");
  return 0;
}

