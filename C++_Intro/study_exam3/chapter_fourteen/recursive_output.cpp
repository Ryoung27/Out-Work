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
 if (n < 10)
 {
     cout << n << endl;
 }
 else
 {
     writeVertical(n/10);
     cout << (n % 10) << endl;
 }
}