#include <iostream>
#include <cmath>

void scale(int a[], int size);

int roundNum(double number);

int main()
{
    using namespace std;
    int someArray[4], index;
    cout << "Enter 4 numbers to scale: ";
    for (index = 0; index < 4; index++)
        cin >> someArray[index];
    scale(someArray, 4);
    cout << "Values scaled to the number of 1000s are: ";
    for (index = 0; index < 4; index++)
        cout << someArray[index] << " ";
    cout << endl;
    return 0;

}

void scale(int a[], int size)
{
    for (int index = 0; index < size; index++)
        a[index] = roundNum(a[index]/1000.0);
}

int roundNum(double number)
{
    using namespace std;
    return static_cast<int>(floor(number + 0.5));
}