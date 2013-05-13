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
  gstack_t *test_gstack = new_gstack();
  gstack_push(test_gstack, 1);
  gstack_push(test_gstack, 2);
  gstack_push(test_gstack, 3);
  gstack_pop(test_gstack);
  assert(test_gstack->size == 2);
  assert(test_gstack->top->val == 2);
  gstack_pop(test_gstack);
  assert(test_gstack->size == 1);
  assert(test_gstack->top->val == 1);
}

int main(int argc, const char *argv[]) {
  printf("\ngstack_t: %ldb\n", sizeof(gstack_t));
  printf("node_t: %ldb\n", sizeof(node_t));
  test(new_gstack);
  test(gstack_push);
  test(gstack_pop);
  puts("... \x1b[32m100%\x1b[0m\n");
  return 0;
}
