#include <iostream>
#include "fraction.h"
using namespace std;

// constructor
Fraction::Fraction() {
  numerator = denominator = 1;
}

Fraction Fraction::operator+(Fraction other) {
  Fraction sum;
  sum.numerator   = denominator * other.denominator;
  sum.denominator = numerator * other.denominator + denominator * other.numerator;
  return sum;
}

bool Fraction::operator==(Fraction other) {
  return (numerator * other.denominator == denominator * other.numerator);
}

istream& operator>>(istream &input, Fraction &other) {
  char symbol;
  input >> other.numerator >> symbol >> other.denominator;
  return input;
}

ostream& operator<<(ostream &output, Fraction &other) {
  output << other.numerator << "/" << other.denominator;
  return output;
}
