#include <iostream>
using namespace std;

int main()
{
    int quarter, dimes, nickels, pennies, total;
    cout << "Press return after entering a number. \n";
    cout << "Please enter the number of quarters. \n";
    cin >> quarter;
    cout << "Please enter the number of dimes. \n";
    cin >> dimes;
    cout << "Please enter the number of nickels. \n";
    cin >> nickels;
    cout << "Please enter the number of pennies. \n";
    cin >> pennies;
    total = (quarter * 25) + (dimes * 10) + (nickels * 5) + (pennies);
    cout << total;
    cout << " cents.\n";
    return 0;
}