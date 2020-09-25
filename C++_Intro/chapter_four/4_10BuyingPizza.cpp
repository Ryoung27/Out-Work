#include <iostream>

using namespace std;

double unitPrice(int diameter, double price);

int main()
{
    int unitPriceSmall, unitPriceSmall;
    double unitPriceSmall, unitPriceSmall,
        unitPriceLarge, unitPriceLarge;

    cout << "Welcome to the Pizza Consumers Union.\n";
    cout << "Enter Diameter of a small pizza (in inches): ";
    cin >> diameterSmall;
    cout << "Enter the price of a small pizza: $";
    cin >> priceSmall;
    cout << "Enter diameter of a large pizza (in inches): ";
    cin >> diameterLarge;
    cout << "Enter the price of a large pizza: $";
    cin >> priceLarge;

    unitPriceSmall = unitPrice(diameterSmall, priceSmall);
    unitPriceLarge = unitPrice(diameterLarge, priceLarge);

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "Small pizza:\n"
         << "Diameter = " << diameterSmall << " inches\n"
         << "Price = $" << priceSmall
         << " Per square inch = $" << unitPriceSmall << endl
         << "Large pizza:\n"
         << "Diameter = " << diameterLarge << " inches\n"
         << "Price = $" << priceLarge
         << " Per square inch = $" << unitPriceLarge << endl;
    if(unitPriceLarge < unitPriceSmall)
        cout << "The large one is the better buy.\n";
    else
        cout << "The small one is the better buy.\n";

    cout << "Buon Appetito!\n";
    return 0;
}

double unitPrice(int diameter, double price)
{
    const double PI = 3.14159;
    double radius, area;

    radius = diameter/static_cast<double>(2);
    area = PI * radius * radius;
    return (price/area);
}