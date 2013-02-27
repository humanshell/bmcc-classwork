#include <stdio.h>

struct date {
  int year;
  int month;
  int day;
};

int main(int argc, char const *argv[]) {

  date today;
  date *t = &today;

  t->year  = 2013;
  t->month = 2;
  t->day   = 25;

  printf("The year is: %i\n", t->year);
  printf("The month is: %i\n", t->month);
  printf("The day is: %i\n", t->day);

  // // declare and use a dynamic variable at runtime
  // int *p;
  // printf("The address in p is %p\n", p);
  // p = new int;
  // *p = 10;
  // printf("The address in p is %p\n", p);
  // printf("The value in p is %i\n", *p);
  // delete p;
  // p = NULL;
  // printf("The address in p is %p\n", p);

  // declare and use a dynamic array at runtime
  int *p;
  p = new int[10];
  // *(p+1) = 25;
  printf("The address in p is %p\n", p);
  printf("The value in p is %i\n", *p);
  p++;
  printf("The address in p is %p\n", p);
  printf("The value in p is %i\n", *p);
  delete p[];

  return 0;
}
