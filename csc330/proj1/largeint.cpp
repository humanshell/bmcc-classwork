#include <iostream>
#include "largeint.h"
using namespace std;

LargeInt::LargeInt() {
  data = new int[41];

  for (int i = 0; i < 41; ++i)
    data[i] = 0;

  length = 0;
}

LargeInt::~LargeInt() {
  data = NULL;
  delete [] data;
}

istream& operator>>(istream &input, LargeInt &li) {
  int i, j;
  char li_char[40];
  input >> li_char;
  li.length = strlen(li_char);

  for (i = li.length - 1, j = 0; i >= 0; --i, ++j)
    li.data[j] = (int) li_char[i] - 48;

  return input;
}

ostream& operator<<(ostream &output, LargeInt &li) {
  for (int i = li.length - 1; i >= 0; --i)
    output << li.data[i];

  return output;
}

void LargeInt::insert(int i) {
  data[length++] = i;
}

bool LargeInt::operator==(const LargeInt &li2) {
  int count;
  (length > li2.length) ? count = length : count = li2.length;

  for (int i = 0; i < count; ++i)
    if (data[i] != li2.data[i])
      return false;

  return true;
}

LargeInt LargeInt::operator+(const LargeInt &li2) {
  LargeInt sum;
  bool carry = false;
  int count, temp_sum;

  (length > li2.length) ? count = length : count = li2.length;

  for (int i = 0; i < count; ++i) {
    temp_sum = data[i] + li2.data[i];
    
    if (carry) temp_sum++;
    
    if (temp_sum > 9) {
      carry = true;
      sum.insert(temp_sum - 10);
    } else {
      carry = false;
      sum.insert(temp_sum);
    }
  }

  return sum;
}
