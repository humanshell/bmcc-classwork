#include <iostream>
#include "largeint.h"
using namespace std;

// constructor
LargeInt::LargeInt() {
  for (int i = 0; i < 40; ++i) {
    data[i] = 0;
  }
  length = 0;
}

// overload cin
istream& operator>>(istream &input, LargeInt &li) {

  char li_char[40];
  input >> li_char;
  li.length = strlen(li_char);

  for (int i = 0; i < li.length; ++i) {
    li.data[i] = (int) li_char[i] - 48;
  }

  return input;
}

// overload cout
ostream& operator<<(ostream &output, LargeInt &li) {
  for (int i = 0; i < 40; ++i) {
    output << li.data[i];
  }

  return output;
}

// insert a single digit
void LargeInt::insert(int x) {
  data[length] = x;
  length++;
}

// overload equality
bool LargeInt::operator==(LargeInt &li2) {
  for (int i = 0; i < length; ++i) {
    if (data[i] != li2.data[i]) {
      return false;
    }
    return true;
  }
}
