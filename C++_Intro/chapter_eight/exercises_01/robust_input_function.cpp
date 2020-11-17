#include <iostream>
#include <cstdlib>
#include <cctype>

void readAndClean(int& n);

void newLine();

void getInt(int& inputNumber);

int main()
{
    using namespace std;
    int inputNumber;
    getInt(inputNumber);
    cout << "Final value read in = " << inputNumber << endl;
    return 0;
}

void getInt(int& inputNumber)
{
    using namespace std;
    char ans;
    do
    {

    } while ((ans != 'y') && (ans != 'Y'));
}