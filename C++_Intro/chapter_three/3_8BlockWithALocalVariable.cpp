#include <iostream>
using namespace std;
int main()
{
    const double TAX_RATE = 0.05 //5% sales tax
    char SaleType;
    int number;
    double price, total;

    cout << "Enter price $";
    cin >> price;
    cout << "Enter number purchased: ";
    cin >> number;
    cout << "Type W if this is a wholesale purchase.\n"
         << "Type R if this is a retail purchase.\n"
         << "Then press Return.\n";
    cin >> SaleType;

    if ((SaleType == 'W') || (SaleType == 'w'))
    {
        total = price * number;
    }
    else if ((SaleType == 'R') || (SaleType == 'r'))
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
    cout.precision(2);
    cout << number << " items at $" << price << endl;
    cout << "Total Bill = $" << total;
    if ((SaleType == 'R') || (SaleType == 'r'))
        cout << " including sales tax.\n"

    return 0;
}