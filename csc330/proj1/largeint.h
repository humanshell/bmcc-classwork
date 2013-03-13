#ifndef LARGEINT_H
#define LARGEINT_H
class LargeInt {
  int *data;
  int length;
  
  friend std::istream& operator>>(std::istream&, LargeInt&);
  friend std::ostream& operator<<(std::ostream&, LargeInt&);

  public:
    LargeInt();
    ~LargeInt();
    void insert(int);
    bool operator==(const LargeInt&);
    LargeInt operator+(const LargeInt&);
};
#endif
