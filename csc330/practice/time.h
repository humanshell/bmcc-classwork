// #ifndef TIME_H
// #define TIME_H
  class time {
    public:
      time();
      void settime(int, int, int);
      void printmilitary();
      void printstandard();

    private:
      int hour;
      int minute;
      int second;
  };
// #endif