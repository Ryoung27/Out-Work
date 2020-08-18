// File name: Health.cpp(It's really Exercise2_17.cpp)
// Author: Ronnie Young (Really whoever wrote this text book.)
// Email Address: Who would put this on github?
// Assignment Number: 2
// Description: Program to determine if the user is ill.
// Last Changed: August 17th.

#include <iostream>
using namespace std;
int main()
{
    const double NORMAL = 98.6; //degrees Fahrenheit
    double temperature;

    cout << "Enter your temperature: ";
    cin >> temperature;

    if (temperature > NORMAL)
    {
        cout << "You have a fever.\n";
        cout << "Drink lots of liquids and get to bed.\n";
    }
    else
    {
        cout << "You don't have a fever.\n";
        cout << "Go study.\n";
    }

    return 0;
}