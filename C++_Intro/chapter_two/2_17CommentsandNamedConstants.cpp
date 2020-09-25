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
        cout << "Your have a fever.\n";
        cout << "Drink lots of liquids and get to bed.\n";
    }
    else
    {
        cout << "You don't have a fever.\n";
        cout << "Go study.\n";
    }

    return 0;
}