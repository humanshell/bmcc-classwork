#include <stdio.h>

int main(int argc, char const *argv[]) {

  // declare and use a dynamic variable at runtime
  int *p;
  printf("The address in p is %p\n", p);
  p = new int;
  *p = 10;
  printf("The address in p is %p\n", p);
  printf("The value in p is %i\n", *p);
  delete p;
  p = NULL;
  printf("The address in p is %p\n", p);

  // declare and use a dynamic array at runtime
  p = new int[10];
  *(p+1) = 25;
  printf("The address in p is %p\n", p);
  printf("The value in p is %i\n", *p);
  p++;
  printf("The address in p is %p\n", p);
  printf("The value in p is %i\n", *p);
  delete []p;

  return 0;
}
