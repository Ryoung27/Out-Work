#include <iostream>
using namespace std;

int main()
{
    int time, distance;
    cout << "Press return after entering a number. \n";
    cout << "Please enter the time in seconds. \n";
    cin >> time;
    distance = ((32 * time) / 2) ;
    cout << distance;
    cout << " feet.\n";
    return 0;
}