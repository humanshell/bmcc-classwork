#include "largeint.cpp"

int main() {
  LargeInt li1, li2;
  int temp_int;

  // ask user for large integer for li1
  cout << "Enter an integer up to 40 digits for your first LargeInt: ";
  cin >> li1;

  // print out li1
  cout << endl << "Here is your first LargeInt:" << endl;
  cout << li1 << endl;

  // ask user for large integer for li2
  cout << "Enter an integer up to 40 digits for your second LargeInt: ";
  cin >> li2;

  // print out li2
  cout << endl << "Here is your second LargeInt:" << endl;
  cout << li2 << endl;

  // ask user to insert a new digit into li1
  cout << endl << "Enter a single digit you'd like inserted into your first LargeInt: ";
  cin >> temp_int;
  li1.insert(temp_int);

  // print out updated li1
  cout << endl << endl << "Here is your updated first LargeInt:" << endl;
  cout << li1 << endl;

  // ask user to insert a new digit into li2
  cout << endl << "Enter a single digit you'd like inserted into your second LargeInt: ";
  cin >> temp_int;
  li2.insert(temp_int);

  // print out updated li2
  cout << endl << endl << "Here is your updated second LargeInt:" << endl;
  cout << li2 << endl;

  cout << endl;
  return 0;
}