#include <iostream>
using namespace std;

void writeVertical(int n);

int main()
{
    cout << "writeVertical(3):" << endl;
    writeVertical(3);
    cout << "writeVertical(125):" << endl;
    writeVertical(125);
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

    for (int powerOf10 = tensInN; powerOf10 > 0; powerOf10 = powerOf10 / 10)
    {
        cout << (n/powerOf10) << endl;
        n = n % powerOf10;
    }
}