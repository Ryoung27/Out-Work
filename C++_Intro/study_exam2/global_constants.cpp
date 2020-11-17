#include <iostream>
#include <cmath>
using namespace std;

const double PI = 3.14159;

double area (double radius);

double volume(double radius);

int main()
{
    double radiusOfBoth, areaOfCircle, volumeOfSphere;

    cout << "Enter a radius to use for both a circle\n"
         << "and a sphere (in inches): ";
    cin >> radiusOfBoth;

    areaOfCircle = area(radiusOfBoth);
    volumeOfSphere = volume(radiusOfBoth);

    cout << "Radius = " << radiusOfBoth << " inches\n"
         << "Area of circle = " << areaOfCircle
         << " square inches\n"
         << "Volume of sphere = " << volumeOfSphere
         << " cubic inches\n";

    return 0;
}

double area(double radius)
{
    return (PI * pow(radius, 2));
}

double volume(double radius)
{
    return ((4.0/3.0) * PI * pow(radius, 3));
}