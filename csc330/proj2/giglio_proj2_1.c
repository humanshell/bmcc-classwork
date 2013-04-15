#include "giglio_proj2_1.h"

// create a new node
node_t *new_node(void *val) {
  node_t *node;

  if (!(node = (node_t *) malloc(sizeof(node_t))))
    return NULL;

  node->prev = NULL;
  node->next = NULL;
  node->val = val;
  return node;
}

// create a new list
list_t *new_list(void) {
  list_t *list;
  if (!(list = (list_t *) malloc(sizeof(list_t)))) return NULL;
  list->curr = NULL;
  list->free = NULL;
  list->match = NULL;
  list->len = 0;
  return list;
}

// destroy a list
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

// insert one node
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

// remove one node
void list_remove_one(list_t *list, node_t *node) {
  if (list->len) {
    if (list->len == 1) {
      list->curr = NULL;
    } else {
      list->curr = node->next;
      node->prev->next = node->next;
      node->next->prev = node->prev;
    }

    if (list->free) list->free(node->val);
    free(node);
    --list->len;
  }
}

// find one node
// return node associated with val or NULL if not found
node_t *list_find(list_t *list, void *val) {
  if (!list->len) return NULL;
  unsigned int len = list->len;

  while (len--) {
    if (list->match)
      if (list->match(val, list->curr->val))
        return list->curr;
    else
      if (list->curr->val == val)
        return list->curr;

    list->curr = list->curr->next;
  }

  return NULL;
}

