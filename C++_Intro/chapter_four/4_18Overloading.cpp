#include <iostream>

double unitPrice(int diameter, double price);

double unitPrice(int length, int width, double price);

int main()
{
    using namespace std;
    int diameter, length, width;
    double priceRound, unitPriceRound, priceRectangular, unitPriceRectangular;

    cout << "Welcome to the Pizza Consumers Union.\n";
    cout << "Enter the diameter in inches"
         << " of a round pizza: ":
    cin  >> diameter;
    cout << "Enter the price of a round pizza: $";
    cin  >> priceRound;
    cout << "Enter the price of a rectangular pizza: $";
}

double unitPrice(int diameter, double price)
{
    const double PI = 3.14159;
    double radius, area;

    radius = diameter/static_cast<double>(2);
    area = PI * radius * radius;
    return (price/area);
}

double unitPrice(int length, int width, double price)
{
    double area = length * width;
    return (price/area);
}