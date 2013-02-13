#include <stdio.h>
#include <math.h>

int main(int argc, const char *argv[]) {
  double theta = 45;
  double length = 55;
  double gravity = 980;
  double pi = 3.14;
  double time;

  theta = theta * (pi/180.);
  time = 2 * pi * sqrt(length/gravity) * (1 + (sin(theta/2) * sin(theta/2)));
  printf("Time = %f", time);
  return 0;
}
