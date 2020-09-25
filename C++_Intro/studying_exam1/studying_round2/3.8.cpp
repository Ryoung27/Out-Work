#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;

int main()
{
    const double TAX_RATE = 0.05;
    char saleType;
    int number;
    double price, total;

    cout << "Enter price $";
    cin >> price;
    cout << "Enter number purchased: ";
    cin >> number;

    cout << "Type W if this is a wholesale purchase.\n"
         << "Type R if this is a retail purchase.\n"
         << "Then press Return.\n";
    cin >> saleType;

    if ((saleType == 'W' || saleType == 'w'))
    {
        total = price * number;
    }
    else if((saleType == 'R' || saleType == 'r'))
    {
        double subtotal;
        subtotal = price * number;
        total = subtotal + subtotal * TAX_RATE;
    }
    else
    {
        cout << "Error in input.\n";
    }

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    // cout.precesion(2);
    cout << number << " items at $" << price << endl;
    if((saleType == 'R' || saleType == 'r'))
        cout << " including sales tax.\n";


    return 0;
}