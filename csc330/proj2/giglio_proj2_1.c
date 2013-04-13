#include "giglio_proj2_1.h"

// create a new node
node_t *new_node(void *val) {
  node_t *node;

  if (!(node = malloc(sizeof(node_t))))
    return NULL;

  node->prev = NULL;
  node->next = NULL;
  node->val = val;
  return node;
}

// create a new node list
list_t *new_list(void) {
  list_t *list;

  if (!(list = malloc(sizeof(list_t))))
    return NULL;

  list->curr = NULL;
  list->free = NULL;
  list->match = NULL;
  list->len = 0;
  return list;
}

// destroy a node list
void destroy_list(list_t *list) {
  unsigned int len = list->len;
  node_t *next;

  while (len--) {
    next = list->curr->next;
    if (list->free) list->free(list->curr->val);
    free(list->curr);
    list->curr = next;
  }

  free(list);
}

node_t *list_insert(list_t *list, node_t *node) {
  if (!node) return NULL;

  if (list->len) {
    node->next = list->curr;
    node->prev = list->curr->prev;
    list->curr->prev->next = node;
    list->curr->prev = node;
    list->curr = node;
  } else {
    node->next = node->prev = node;
    list->curr = node;
  }

  ++list->len;
  return node;
}


