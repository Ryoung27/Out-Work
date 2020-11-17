#include <iostream>

void initializeScreen();

double celsius(double fahrenheit);

void showResult(double fDegrees, double cDegrees);

int main()
{
    using namespace std;
    double fTemperature, cTemperature;

    initializeScreen();
    cout << " I will conver a Fahrenheit temperature"
         << " to Celsius.\n"
         << "Enter a temperature in Fahrenheit: ";
    cin >> fTemperature;

    cTemperature = celsius(fTemperature);

    showResult(fTemperature, cTemperature);

    return 0;
}

void initializeScreen()
{
    using namespace std;
    cout << endl;
    return;
}

double celsius(double fahrenheit)
{
    return ((5.0/9.0) * (fahrenheit - 32));
}

void showResult(double fDegrees, double cDegrees)
{
    using namespace std;
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(1);
    cout << fDegrees
         << " degrees Fahrenheit is equivalent to\n"
         << cDegrees << " degrees Celsius.\n";
    return;
}