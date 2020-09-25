#include <iostream>

void iceCreamDivision(int number, double totaWeight)
//Outputs instructions for dividing totalWeight ounces of
//ice cream among number customers.
//If number is 0, nothing is done.
{
    using namespace std;
    double portion;

    if(number == 0)
        return;

    portion = totalWeight/Number;
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "Each one receives "
         << portion << " ounces of ice cream." << endl;
}