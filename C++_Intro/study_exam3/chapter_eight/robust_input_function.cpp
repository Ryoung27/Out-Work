#include <iostream>
#include <cstdlib>
#include <cctype>

void readAndClean(int& n);
//Reads and cleans input and returns the integers.

// void newLine();

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
        cout << "Enter input number: ";
        readAndClean(inputNumber);
        cout << "You entered "<< inputNumber
             << " Is that correct? (y/n): ";
        cin >> ans;
    } while ((ans != 'y') && (ans != 'Y'));
}

void readAndClean(int& n)
{
    using namespace std;
    const int ARRAY_SIZE = 6;
    char digitString[ARRAY_SIZE];

    char next;
    cin.get(next);
    int index = 0;
    while (next != '\n')
    {
        if ((isdigit(next)) && (index < ARRAY_SIZE - 1))
        {
            digitString[index] = next;
            index++;
        }
        cin.get(next);
    }
    digitString[index] = '\0';
    n = atoi(digitString);
}