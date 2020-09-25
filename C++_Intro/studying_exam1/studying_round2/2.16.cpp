#include <iostream>
using namespace std;
int main()
{
    double balance = 50.00;
    int count = 0;
    cout << "This program calculates interest.\n";

    while (balance < 100.00)
    {
        balance = balance + 0.02 * balance;
        count++;
    }
    cout << "After " << count << " months.\n";
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "your balance due will be $" << balance << endl;
    return 0;
}