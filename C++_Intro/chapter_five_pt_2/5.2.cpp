#include <iostream>

void initializedScreen();

double celsius(double fahrenheit);

void showResults(double fDegrees, double cDegrees);

int main()
{
    using namespace std;
    double fTemperature, cTemperature;

    initializedScreen();
    cout << "I will convert a Fahrenheit temperature"
         << " to Celsius.\n"
         << "Enter a temperature in Fahrenheit: ";
    cin >> fTemperature;

    cTemperature = celsius(fTemperature);

    showResults(fTemperature, cTemperature);
    return 0;
}

void initializedScreen()
{
    using namespace std;
    cout << endl;
    return;
}

double celsius(double fahrenheit)
{
    return((5.0/9.0) * (fahrenheit - 32));
}

void showResults(double fDegrees, double cDegrees)
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