#include <assert.h>
#include <stdlib.h>
#include <stdio.h>
#include "giglio_proj2_1.h"

// Helpers

#define test(fn) \
  puts("... \x1b[33m" # fn "\x1b[0m"); \
  test_##fn();

// Tests

