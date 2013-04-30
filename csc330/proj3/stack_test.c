#include <assert.h>
#include <stdlib.h>
#include <stdio.h>
#include "stack.h"

// Helpers

#define test(fn) \
  puts("... \x1b[33m" # fn "\x1b[0m"); \
  test_##fn();

// Tests

int main(int argc, const char *argv[]) {
  printf("\nstack_t: %ldb\n", sizeof(list_t));
  test();
  puts("... \x1b[32m100%\x1b[0m\n");
  return 0;
}
