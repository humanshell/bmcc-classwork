#include "giglio_proj2_2.h"

// create a new node
node_t *new_node(int val) {
  node_t *node;
  if (!(node = (node_t *) malloc(sizeof(node_t)))) return NULL;
  node->prev = NULL;
  node->next = NULL;
  node->val = val;
  return node;
}

// create a new list
list_t *new_list(void) {
  list_t *list;
  if (!(list = (list_t *) malloc(sizeof(list_t)))) return NULL;
  list->head = NULL;
  list->len = 0;
  return list;
}

// destroy a list
void list_destroy(list_t *list) {
  unsigned int len = list->len;
  node_t *next, *curr = list->head;

  while (len--) {
    next = curr->next;
    free(curr);
    curr = next;
  }

  free(list);
}

// insert one node
void list_insert(list_t *list, node_t *node) {
  switch (list->len) {
    case 0:
      list->head = node->next = node->prev = node;
      break;
    case 1:
      list->head->next = list->head->prev = node;
      node->next = node->prev = list->head;
      break;
    default:
      if (node->val >= list->head->val ||
          node->val <= list->head->next->val) {
        // insert new node between head and head->next
        node->next = list->head->next;
        node->prev = list->head;
        list->head->next->prev = node;
        list->head->next = node;
      } else {
        // we need to walk the list to find appropriate insertion point
        node_t *curr = list->head->next;
        do {
          if (node->val <= curr->next->val) {
            node->next = curr->next;
            node->prev = curr;
            curr->next->prev = node;
            curr->next = node;
            break;
          } else {
            curr = curr->next;
          }
        } while (node->val > curr->val);
      }
      break;
  }

  if (node->val >= list->head->val) list->head = node;
  ++list->len;
}

// remove one node
void list_remove(list_t *list, node_t *node) {
  if (list->len) {
    if (list->len == 1) {
      list->head = NULL;
    } else {
      if (list->head == node) list->head = node->prev;
      node->prev->next = node->next;
      node->next->prev = node->prev;
    }

    free(node);
    --list->len;
  }
}

// remove each occurrence of node
void list_remove_each(list_t *list, node_t *node) {
  if (list->len) {
    int val = node->val;
    node_t *match;
    while ((match = list_find(list, val)))
      list_remove(list, match);
  }
}

// remove all nodes
void list_remove_all(list_t *list) {
  if (list->len) {
    unsigned int len = list->len;
    node_t *next, *curr = list->head->next;

    while (len--) {
      next = curr->next;
      free(curr);
      curr = next;
    }

    list->len = 0;
    list->head = NULL;
  }
}

// find one node
// return node associated with val or NULL if not found
node_t *list_find(list_t *list, int val) {
  if (!list->len) return NULL;
  unsigned int len = list->len;
  node_t *curr = list->head->next;

  while (len--) {
    if (curr->val == val) return curr;
    curr = curr->next;
  }

  return NULL;
}

