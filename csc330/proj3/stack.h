#ifndef __STACK_H__
#define __STACK_H__

#ifdef __cplusplus
extern "C" {
#endif

// stack structure object
typedef struct {
  node_t *top;
  int size;
} stack_t;

// node structure object
typedef struct node {
  struct node *next;
  int val;
} node_t;

stack_t *new_stack(void);      // initialize a new stack object
void stack_push(stack_t, int); // push new item onto stack
void stack_pop(stack_t);       // pop top item off of stack

#ifdef __cplusplus
}
#endif

#endif /* __STACK_H__ */

