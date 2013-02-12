#include <iostream>
#include "largeint.h"
using namespace std;


/**
 * constructor
 * The constructor initializes the class' data array to all zeros
 * so there is always a number at each index when we add them up.
 * It also initializes the length member variable to 0.
 */
LargeInt::LargeInt() {
  for (int i = 0; i < 40; ++i)
    data[i] = 0;

  length = 0;
}


/**
 * overload cin
 * We need to overload the cin (>>) operator so a user can create
 * a new LargeInt object from code. We do this by taking the integer
 * from the command line as a string and placing it into a char array.
 * We then loop over the chars in that array and cast them to ints
 * before inserting them into our internal data array. We also store
 * them in reverse order to make it easier to perform addition on
 * two LargeInt instances later on.
 */
istream& operator>>(istream &input, LargeInt &li) {
  int i, j;
  char li_char[40];
  input >> li_char;
  li.length = strlen(li_char);

  for (i = li.length - 1, j = 0; i >= 0; --i, ++j)
    li.data[j] = (int) li_char[i] - 48;

  return input;
}


/**
 * overload cout
 * We need to overload the cout (<<) operator so a user can print an
 * instance of a LargeInt to the console. We do this by looping over
 * the data array and printing out each number in reverse order. We
 * have to do this because we stored the numbers in reverse order when
 * they were first added via the overloaded cin (>>) operator.
 */
ostream& operator<<(ostream &output, LargeInt &li) {
  for (int i = li.length - 1; i >= 0; --i)
    output << li.data[i];

  return output;
}


/**
 * insert method
 * This method simply inserts a single digit into the data array. It
 * does this by inserting the number at the end of the data array.
 * Because we're storing the large int in reverse, the inserted digit
 * will be added to the beginning of the large int. So, if we have
 * 100,000 and a user inserts a 1 the large int will be 1,100,000.
 */
void LargeInt::insert(int i) {
  data[length] = i;
  length++;
}


/**
 * overload equality
 * We need to be able to determine if one instance of a LargeInt is
 * equivalent to another. Th overloaded "==" operator does this by
 * first determining which LargeInt has a longer length. We have to
 * loop over the larger one so every number gets compared. It then
 * loops over the largest int's data array comparing each number to
 * the internal data array. If it finds a number that doesn't match,
 * it immediately returns false. If all numbers match it returns true.
 */
bool LargeInt::operator==(LargeInt &li2) {
  int count;
  (length > li2.length) ? count = length : count = li2.length;

  for (int i = 0; i < count; ++i) {
    if (data[i] != li2.data[i])
      return false;
  }

  return true;
}


/**
 * overload addition
 * The overloaded addition operator allows a user to add 2 LargeInts
 * and return that value as a new instance of a LargeInt. The method
 * first determines which LargeInt is longer and sets the loop counter
 * to that value. It then uses a for loop to add each number from two
 * LargeInt data arrays. It uses a bool value to determine if the
 * addition resulted in a carry. If it did, the temp sum variable is
 * incremented. The result of each addition operation is inserted into
 * the data array of the LargeInt that will be returned when done.
 */
LargeInt LargeInt::operator+(LargeInt &li2) {
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
