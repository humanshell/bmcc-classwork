#include <stdio.h>
#include <string.h>
#include "gstack.h"

// these constants define operator precedence
#define ADD 1
#define SUB 1
#define MUL 2
#define DIV 2

// global variables for evaluating user's expression
char c, *expression;

// main function
int main(void) {

  // allocate memory for expression
  if (!(expression = (char *) malloc(sizeof(c)))) {
    printf("Could not allocate memory for your expression!\n");
    return EXIT_FAILURE;
  }

  // ask the user for an expression
  printf("Enter an expression and press return: \n");

  // build a dynamic string from the user's input
  int i = 0;
  while ((c = getchar()) != '\n') {
    if (c != ' ') {
      expression[i++] = (char) c;
      expression = realloc(expression, sizeof(expression) + sizeof(c));
    }
  }
  expression[i] = '\0';

  printf("Expression: %s\n", expression);

  // parse and evaluate the user's infix expression
  for (int i = 0, len = strlen(expression) - 1; i < len; i++) {
    
  }
  
  // free expression and return
  free(expression);
  expression = NULL;
  return 0;

}

