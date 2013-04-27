#include <assert.h>
#include <stdlib.h>
#include <stdio.h>
#include "giglio_proj2_1.h"

// Helpers

#define test(fn) \
  puts("... \x1b[33m" # fn "\x1b[0m"); \
  test_##fn();

// Tests

static void test_new_node(void) {
  node_t *test_node = new_node(1);
  assert(test_node->val == 1);
  assert(test_node->next == NULL);
  assert(test_node->prev == NULL);
}

static void test_new_list(void) {
  list_t *test_list = new_list();
  assert(test_list->len == 0);
  assert(test_list->head == NULL);
}

static void test_list_insert(void) {
  list_t *test_list   = new_list();
  node_t *test_node_1 = new_node(2);
  node_t *test_node_2 = new_node(3);
  node_t *test_node_3 = new_node(5);
  node_t *test_node_4 = new_node(1);
  node_t *test_node_5 = new_node(4);

  // first node
  list_insert(test_list, test_node_1);
  assert(test_list->len == 1);
  assert(test_list->head == test_node_1);
  assert(test_node_1->next == test_node_1);
  assert(test_node_1->prev == test_node_1);

  // second node
  list_insert(test_list, test_node_2);
  assert(test_list->len == 2);
  assert(test_list->head == test_node_2);
  assert(test_node_2->next == test_node_1);
  assert(test_node_2->prev == test_node_1);
  assert(test_node_1->next == test_node_2);
  assert(test_node_1->prev == test_node_2);

  // third node >= head
  list_insert(test_list, test_node_3);
  assert(test_list->len == 3);
  assert(test_list->head == test_node_3);
  assert(test_node_3->next == test_node_1);
  assert(test_node_3->prev == test_node_2);
  assert(test_node_1->prev == test_node_3);
  assert(test_node_2->next == test_node_3);

  // fourth node <= head->next
  list_insert(test_list, test_node_4);
  assert(test_list->len == 4);
  assert(test_list->head == test_node_3);
  assert(test_node_4->next == test_node_1);
  assert(test_node_4->prev == test_node_3);
  assert(test_node_3->next == test_node_4);
  assert(test_node_1->prev == test_node_4);

  // fifth node > head->next AND < head
  list_insert(test_list, test_node_5);
  assert(test_list->len == 5);
  assert(test_list->head == test_node_3);
  assert(test_node_5->next == test_node_3);
  assert(test_node_5->prev == test_node_2);
  assert(test_node_3->prev == test_node_5);
  assert(test_node_2->next == test_node_5);
}

static void test_list_remove(void) {
  list_t *test_list   = new_list();
  node_t *test_node_1 = new_node(1);
  node_t *test_node_2 = new_node(2);
  node_t *test_node_3 = new_node(3);

  // one node
  list_insert(test_list, test_node_1);
  list_remove(test_list, test_node_1);
  assert(test_list->len == 0);
  assert(test_list->head == NULL);
  test_node_1 = new_node(1);

  // two nodes
  list_insert(test_list, test_node_1);
  list_insert(test_list, test_node_2);
  list_remove(test_list, test_node_2);
  assert(test_list->len == 1);
  assert(test_list->head == test_node_1);
  assert(test_node_1->next == test_node_1);
  assert(test_node_1->prev == test_node_1);
  test_node_2 = new_node(2);
  list_insert(test_list, test_node_2);
  list_remove(test_list, test_node_1);
  assert(test_list->len == 1);
  assert(test_list->head == test_node_2);
  assert(test_node_2->next == test_node_2);
  assert(test_node_2->prev == test_node_2);
  test_node_1 = new_node(1);

  // > two nodes
  list_insert(test_list, test_node_1);
  list_insert(test_list, test_node_3);
  list_remove(test_list, test_node_1);
  assert(test_list->len == 2);
  assert(test_list->head == test_node_3);
  assert(test_node_2->next == test_node_3);
  assert(test_node_2->prev == test_node_3);
  assert(test_node_3->next == test_node_2);
  assert(test_node_3->prev == test_node_2);
  test_node_1 = new_node(1);
  list_insert(test_list, test_node_1);
  list_remove(test_list, test_node_3);
  assert(test_list->len == 2);
  assert(test_list->head == test_node_2);
  assert(test_node_1->next == test_node_2);
  assert(test_node_1->prev == test_node_2);
  assert(test_node_2->next == test_node_1);
  assert(test_node_2->prev == test_node_1);
}

static void test_list_remove_each(void) {
  list_t *test_list   = new_list();
  node_t *test_node_1 = new_node(1);
  node_t *test_node_2 = new_node(1);
  node_t *test_node_3 = new_node(2);

  // no match
  list_insert(test_list, test_node_1);
  list_remove_each(test_list, test_node_3);
  assert(test_list->len == 1);

  // one match
  list_insert(test_list, test_node_3);
  list_remove_each(test_list, test_node_1);
  assert(test_list->len == 1);
  test_node_1 = new_node(1);

  // > one match
  list_insert(test_list, test_node_1);
  list_insert(test_list, test_node_2);
  list_remove_each(test_list, test_node_1);
  assert(test_list->len == 1);
}

static void test_list_remove_all(void) {
  list_t *test_list = new_list();
  list_insert(test_list, new_node(1));
  list_insert(test_list, new_node(2));
  list_insert(test_list, new_node(3));
  list_remove_all(test_list);
  assert(test_list->len == 0);
  assert(test_list->head == NULL);
}

static void test_list_find(void) {
  list_t *test_list = new_list();
  node_t *match, *test_node_1 = new_node(1);
  match = list_find(test_list, 1);
  assert(match == NULL);
  list_insert(test_list, test_node_1);
  match = list_find(test_list, 1);
  assert(match->val == 1);
}

int main(int argc, const char *argv[]) {
  printf("\nlist_t: %ldb\n", sizeof(list_t));
  printf("node_t: %ldb\n", sizeof(node_t));
  test(new_node);
  test(new_list);
  test(list_insert);
  test(list_remove);
  test(list_remove_each);
  test(list_remove_all);
  test(list_find);
  puts("... \x1b[32m100%\x1b[0m\n");
  return 0;
}
