#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include "gstack.h"

// global variables for errors and stacks
gstack_t *operators;
gstack_t *operands;
int error = 0;

void print_stacks() {
  node_t *current_operator = operators->top;
  node_t *current_operand  = operands->top;
  printf("\n");
  printf("Operators: ");
  do {
    printf("%c ", current_operator->val);
    current_operator = current_operator->next;
  } while (current_operator->next != NULL);
  printf("Operands: ");
  do {
    printf("%c ", current_operand->val);
    current_operand = current_operand->next;
  } while (current_operand->next != NULL);
  printf("\n");
}

// returns 1 if op1 has lower or equal priority than op2, 0 otherwise
int has_lower_priority(char op1, char op2)   {
  switch(op1) {
    case '(': return 0;
    case '-': return 1;
    case '+': return op2 == '-' ? 1 : 0;
    case '*': return (op2 != '-' || op2 != '+') ? 1 : 0;
    case '/': return (op2 == '/' || op2 == ')') ? 1 : 0;
    default : error = 1; return 0;
  }
}

// perform the operation 'op' on the two operands on top of the stack
void eval_stack_using(char op) {
  if(operands->size < 2) error = 1; return;

  int op2 = gstack_pop(operands);
  int op1 = gstack_pop(operands);

  switch(op)  {
    case '+': gstack_push(operands, op1 + op2); break;
    case '-': gstack_push(operands, op1 - op2); break;
    case '*': gstack_push(operands, op1 * op2); break;
    case '/': gstack_push(operands, op1 / op2); break;
    default : error = 1; return;
  }
}

// main function
int main(void) {

  // initialize our global stacks
  operators = new_gstack();
  operands  = new_gstack();

  //print_stacks();

  // variables for storing and parsing infix expression
  char exp[1000], *p;
  int len;

  // enter infinite loop to eval user input
  while (1) {

    // get the expression
    printf("\nEnter an expression (Q to exit): ");
    scanf("%[^\n]%*c", exp);
    if (exp[0] == 'q' || exp[0] == 'Q') break;
    
    len = strlen(exp);
    if (len == 0) { getchar(); continue; }

    // normalize the string for easier evaluation
    exp[len] = ' ';
    exp[len + 1] = ')';
    exp[len + 2] = '\0';
    error = 0;
    gstack_push(operators, '(');

    p = strtok(exp, " ");
    while (p && !error) {
      if (isdigit(p[0])) {
        gstack_push(operands, atoi(p));
      } else {
        switch(p[0]) {
          case '(':
            gstack_push(operators, p[0]);
            break;
          default:
            while (operators->size && !error && has_lower_priority(operators->top->val, p[0])) {
              eval_stack_using(operators->top->val);
              gstack_pop(operators);
            }

            if (operators->size) 
              if (p[0] == ')')
                gstack_pop(operators);
              else
                gstack_push(operators, p[0]);
            else
              error = 1;
        }
      }
    }

    p = strtok(NULL, " ");
  }

  if (error || operators->size || operands->size != 1) {
    printf("ERROR!\n");
    while (operands->size)
      gstack_pop(operands);
    while (operators->size)
      gstack_pop(operators);
  } else {
    printf("%d\n", operands->top->val);
    gstack_pop(operands);
  }

  // free stacks and return
  free(operators);
  free(operands);
  return 0;

}

