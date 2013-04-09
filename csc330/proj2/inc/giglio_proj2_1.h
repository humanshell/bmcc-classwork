#ifndef __GIGLIO_PROJ2_1_H__
#define __GIGLIO_PROJ2_1_H__

#ifdef __cplusplus
extern "C" {
#endif

#include <stdlib.h>

// structure defining what a "node" is
typedef struct node {
  struct node *next;
  struct node *prev;
  void *val;
} node_t;

// structure to control an entire list of nodes
typedef struct node_list {
  node_t *cursor;
  unsigned int len;
  void (*free)(void *val);
} node_list_t;

#ifdef __cplusplus
}
#endif

#endif /* __GIGLIO_PROJ2_1_H__ */

