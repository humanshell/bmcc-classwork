#ifndef __GSTACK_H__
#define __GSTACK_H__

#ifdef __cplusplus
extern "C" {
#endif

#include <stdlib.h>

// node structure object
typedef struct node {
  struct node *next;
  int val;
} node_t;

// stack structure object
typedef struct {
  node_t *top;
  unsigned int size;
} gstack_t;

gstack_t *new_gstack(void);      // initialize a new stack object
void gstack_push(gstack_t, int); // push new item onto stack
void gstack_pop(gstack_t);       // pop top item off of stack

#ifdef __cplusplus
}
#endif

#endif /* __GSTACK_H__ */

