#include "giglio_proj2_1.h"

// create a new node
node_t *new_node(void *val) {
  node_t *node;

  if (!(node = malloc(sizeof(node_t))))
    return NULL;

  node->prev = NULL;
  node->next = NULL;

  if (val)
    node->val = val;
  else
    node->val = NULL;

  return node;
}

// create a new node list
node_list_t *new_node_list(void) {
  node_list_t *list;

  if (!(list = malloc(sizeof(node_list_t))))
    return NULL;

  list->curr = NULL;
  list->free = NULL;
  list->len = 0;
  return list;
}

// destroy a node list
void destroy_node_list(node_list_t *list) {
  unsigned int len = list->len;
  node_t *next;
  node_t *curr = list->curr;

  while (len--) {
    next = curr->next;
    if (list->free) list->free(curr->val);
    free(curr);
    curr = next;
  }

  free(list);
}

