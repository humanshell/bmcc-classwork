#include <assert.h>
#include <stdlib.h>
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

int main(int argc, const char *argv[]) {
  printf("\ngstack_t: %ldb\n", sizeof(gstack_t));
  printf("node_t: %ldb\n", sizeof(node_t));
  test(new_gstack);
  //test(new_list);
  //test(list_insert);
  //test(list_remove);
  //test(list_remove_each);
  //test(list_remove_all);
  //test(list_find);
  puts("... \x1b[32m100%\x1b[0m\n");
  return 0;
}
