#include <iostream>
#include <cstdlib>
using namespace std;

int power(int x, int n);

int main()
{
    return 0;
}

int power(int x, int n)
{
    if (n < 0)
    {
        cout << "Illegal argument to power.\n";
        exit(1);
    }

    if (n > 0)
    {
        return (power(x, n-1) * x);
    }
    else
        return (1);

}