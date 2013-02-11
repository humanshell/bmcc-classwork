#ifndef FRACTION_H
#define FRACTION_H
class Fraction {
    friend std::istream &operator>>(std::istream&, Fraction&);
    friend std::ostream &operator<<(std::ostream&, Fraction&);

  private:
    int numerator, denominator;

  public:
    Fraction();
    Fraction operator+(Fraction);
    bool     operator==(Fraction);
};
#endif