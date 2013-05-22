#include <assert.h>
#include <stdio.h>
#include "gstack.h"

// Helpers

#define test(fn) \
  puts("... \x1b[33m" # fn "\x1b[0m"); \
  test_##fn();

// Tests

static void test_new_gstack(void) {
  gstack_t *test_gstack = new_gstack();
  assert(test_gstack->size == 0);
  assert(test_gstack->top == NULL);
}

static void test_gstack_push(void) {
  gstack_t *test_gstack = new_gstack();
  gstack_push(test_gstack, 1);
  assert(test_gstack->size == 1);
  assert(test_gstack->top->val == 1);
  gstack_push(test_gstack, 2);
  assert(test_gstack->size == 2);
  assert(test_gstack->top->val == 2);
  gstack_push(test_gstack, 3);
  assert(test_gstack->size == 3);
  assert(test_gstack->top->val == 3);
}

static void test_gstack_pop(void) {
  int old_top_val = 0;
  gstack_t *test_gstack = new_gstack();
  gstack_push(test_gstack, 1);
  gstack_push(test_gstack, 2);
  gstack_push(test_gstack, 3);
  old_top_val = gstack_pop(test_gstack);
  assert(test_gstack->size == 2);
  assert(test_gstack->top->val == 2);
  assert(old_top_val == 3);
  old_top_val = gstack_pop(test_gstack);
  assert(test_gstack->size == 1);
  assert(test_gstack->top->val == 1);
  assert(old_top_val == 2);
  old_top_val = gstack_pop(test_gstack);
  assert(test_gstack->size == 0);
  assert(test_gstack->top == NULL);
  assert(old_top_val == 1);
  old_top_val = gstack_pop(test_gstack);
  assert(test_gstack->size == 0);
  assert(test_gstack->top == NULL);
  assert(old_top_val == 0);
}

int main(int argc, const char *argv[]) {
  printf("\ngstack_t: %db\n", sizeof(gstack_t));
  printf("node_t: %db\n", sizeof(node_t));
  test(new_gstack);
  test(gstack_push);
  test(gstack_pop);
  puts("... \x1b[32m100%\x1b[0m\n");
  return 0;
}
