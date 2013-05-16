#include <stdio.h>
#include <string.h>
#include "gstack.h"

// main function
int main(void) {

  // variables and objects needed to evaluate user's expression
  char c, *exp;

  // allocate memory for expression
  if (!(exp = (char *) malloc(sizeof(c)))) {
    printf("Could not allocate memory for your expression!\n");
    return EXIT_FAILURE;
  }

  // ask the user for an expression
  printf("Enter an expression and press return: \n");

  // build a dynamic string from the user's input
  int i = 0;
  while ((c = getchar()) != '\n') {
    if (c != ' ') {
      exp[i++] = (char) c;
      exp = realloc(exp, sizeof(exp) + sizeof(c));
    }
  }
  exp[i] = '\0';

  printf("Expression: %s\n", exp);

  // parse and evaluate the user's infix expression

  
  // free expression and return
  free(exp);
  exp = NULL;
  return 0;

}

