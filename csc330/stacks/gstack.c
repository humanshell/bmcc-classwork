#include "gstack.h"

// initialize a new stack object
gstack_t *new_gstack(void) {
  gstack_t *gstack;
  if (!(gstack = (gstack_t *) malloc(sizeof(gstack_t)))) return NULL;
  gstack->top = NULL;
  gstack->size = 0;
  return gstack;
}

// push new item onto stack
void gstack_push(gstack_t *gstack, int val) {
  node_t *node = (node_t *) malloc(sizeof(node_t));
  node->val = val;
  node->next = gstack->top;
  gstack->top = node;
  ++gstack->size;
}

// pop top item off of stack
int gstack_pop(gstack_t *gstack) {
  int retval = 0;

  if (gstack->size) {
    node_t *old_top = gstack->top;
    gstack->top = gstack->top->next;
    retval = old_top->val;
    free(old_top);
    --gstack->size;
  }

  return retval;
}

