#ifndef LARGEINT_H
#define LARGEINT_H
class LargeInt {
  friend std::istream& operator>>(std::istream&, LargeInt&);
  friend std::ostream& operator<<(std::ostream&, LargeInt&);
  
  int data[41];
  int length;

  public:
    LargeInt();
    void insert(int);
    bool operator==(const LargeInt&);
    LargeInt operator+(const LargeInt&);
};
#endif