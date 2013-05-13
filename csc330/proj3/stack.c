#include "stack.h"

// initialize a new stack object
stack_t *new_stack(void) {
  stack_t *stack;
  if (!(stack = (stack_t *) malloc(sizeof(stack_t)))) return NULL;
  stack->top = NULL;
  stack->size = 0;
  return stack;
}

// push new item onto stack
void stack_push(stack_t stack, int val) {
  node_t *node = (node_t *) malloc(sizeof(node_t));
  node->val = val;
  node->next = stack->top;
  stack->top = node;
  ++stack->size;
}

// pop top item off of stack
void stack_pop(stack_t stack) {
  if (stack->size) {
    node_t *old_top = stack->top;
    stack->top = stack->top->next;
    free(old_top);
    --stack->size;
  }
}

