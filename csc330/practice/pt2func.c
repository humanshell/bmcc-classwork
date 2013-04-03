/* This file tests the syntax and use of function pointers */
#include <stdio.h>

int add(int x, int y){return x + y;}
int sub(int x, int y){return x - y;}
int mul(int x, int y){return x * y;}
int div(int x, int y){return x / y;}

int main(int argc, const char *argv[]) {
  int x = 12345;
  int (*pt2func)(int, int) = &add;

  printf("%d + %d = %d\n", x, x, (*pt2func)(x, x));
  pt2func = &sub;
  printf("%d - %d = %d\n", x, x, (*pt2func)(x, x));
  pt2func = &mul;
  printf("%d * %d = %d\n", x, x, (*pt2func)(x, x));
  pt2func = &div;
  printf("%d / %d = %d\n", x, x, (*pt2func)(x, x));
  return 0;
}
