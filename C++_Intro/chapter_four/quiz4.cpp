#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;
int factorial(int n)
{
    int product = 0;
    while(n > 0)
    {
        product = product * n;
        n--;
    }
    return product;
}

int main()
{

    // cout << (pow(2,sqrt(9.0)+ceil(0.99))) << endl;

    // cout << floor(4.0) + ceil(2.0) << endl;

    // cout << rand()%8 + 10 << endl;
    // cout << rand()%9 + 10 << endl;
    // cout << rand()%11 + 10 << endl;
    // cout << rand()%10 + 10 << endl;

    // cout << static_cast<float>(3/4) << endl;

    // double size, volume=16.0;
    // size = sqrt(sqrt(volume)) / 3;
    // cout.setf(ios::fixed);
    // cout.setf(ios::showpoint);
    // cout.precision(3);
    // cout << size;

    cout << factorial(4);



}
