#include <iostream>
using namespace std;

// constructor
#include "time.h"
time::time() {
  hour = minute = second = 0;
}

void time::settime(int h, int m, int s) {
  hour   = ( h >= 0 && h < 24 ) ? h : 0;
  minute = ( m >= 0 && m < 60 ) ? m : 0;
  second = ( s >= 0 && s < 60 ) ? s : 0;
}

void time::printmilitary() {
  cout << ( hour   < 10 ? "0" : " ") << hour << ":"
       << ( minute < 10 ? "0" : " ") << minute << ":"
       << ( second < 10 ? "0" : " ") << second;
}

void time::printstandard() {
  cout << ( ( hour == 0 || hour == 12) ? 12 : hour % 12 )
       << ":" << ( minute < 10 ? "0" : " ") << minute
       << ":" << ( second < 10 ? "0" : " ") << second
       << ( hour < 12 ? " AM" : " PM");
}