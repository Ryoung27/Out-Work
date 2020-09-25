#include <iostream>
using namespace std;

int main()
{
    char symbol1, symbol2, symbol3;

    cout << "Please enter the first letter of your first and last name.";
    cin >> symbol1;
    cin >> symbol2;

    symbol3 = ' ';
    cout << "Your initals are " << symbol1 << symbol3 << symbol2 << endl;

    return 0;
}