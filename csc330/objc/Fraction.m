// a class and program to work with fractions

#include <stdio.h>
#include <objc/Object>

@interface Fraction: Object

- (void) print;
- (void) setNumerator: (int) n;
- (void) setDenominator: (int) d;

@end

@implementation Fraction
{
  int numerator;
  int denominator;
}

- (void) print
{
  printf("%i/%i", numerator, denominator);
}

- (void) setNumerator: (int) n
{
  numerator = n;
}

- (void) setDenominator: (int) d
{
  denominator = d;
}

@end

int main(int argc, char * argv[]) {
  Fraction *myFraction = [[Fraction alloc] init];
  [myFraction setNumerator: 1];
  [myFraction setDenominator: 3];
  printf("The value of myFraction is: ");
  [myFraction print];
}

