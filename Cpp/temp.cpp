#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
     int a = 6;
     int b = 3;
     switch (a+b)
     {
     case 4:
          cout << "a is equal to 4" << endl;
          break;
     case 5:
          cout << "a is equal to 5" << endl;
          break;
     default:
          cout << "a is not equal to any of the given numbers" << endl;
          break;
     }
     return 0;
}
