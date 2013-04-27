#ifndef __GIGLIO_PROJ2_2_H__
#define __GIGLIO_PROJ2_2_H__

#ifdef __cplusplus
extern "C" {
#endif

#include <stdlib.h>

// structure defining what a "node" is
typedef struct node {
  struct node *next;
  struct node *prev;
  int val;
} node_t;

// structure to control a list of nodes
typedef struct {
  node_t *head;
  unsigned int len;
} list_t;

node_t *new_node(int);                     // create a new node
list_t *new_list(void);                    // create a new list
void list_destroy(list_t *);               // destroy a list
void list_insert(list_t *, node_t *);      // insert one node
void list_remove(list_t *, node_t *);      // remove one node
void list_remove_each(list_t *, node_t *); // remove each occurrence of node
void list_remove_all(list_t *);            // remove all nodes
node_t *list_find(list_t *, int);          // find one node

#ifdef __cplusplus
}
#endif

#endif /* __GIGLIO_PROJ2_2_H__ */

