#include <iostream>
using namespace std;


void writeVertical(int n);
//Precondition: n >= 0.
//Postcondition: The number n is written to the screen vertically
//with each digit on a separate line.

int main()
{
    cout << "writeVertical(3):" << endl;
    writeVertical(3);

    cout << "writeVertical(12):" << endl;
    writeVertical(12);

    cout << "writeVertical(123):" << endl;
    writeVertical(123);

    return 0;
}


void writeVertical(int n)
{
    int tensInN = 1;
    int leftEndPiece = n;
    while (leftEndPiece > 9)
    {
        leftEndPiece = leftEndPiece/10;
        tensInN = tensInN * 10;
    }

    for (int powerOf10 = tensInN; powerOf10 > 0; powerOf10 = powerOf10/10)
    {
        cout << (n/powerOf10) << endl;
        n = n % powerOf10;
    }
}