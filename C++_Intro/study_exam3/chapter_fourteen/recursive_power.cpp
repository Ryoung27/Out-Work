#include <iostream>
#include <stdlib>
using namespace std;

int power(int x, int n);

int main()
{
    for (int n = 0; n < 4; n++)
        cout << "3 to the power " << n
             << " is " << power(3, n) << endl;
}

int power(int x, int n)
{
    if (n < 0)
    {
        cout << "Illegal argument to power.\n";
        exit(1);
    }

    if ( n > 0)
        return ( power(x, n - 1) * x);
    else
        return (1);
}