#include <iostream>
#include <cstdlib>
#include <cctype>

void readAndClean(int& n);

void newLine();

int main(){
    using namespace std;
    int n;
    char ans;
    do
    {
        cout << "Enter an integer and press Return: ";
        readAndClean(n);
        cout << "That string converts to the integer " << n << endl;
        cout << "Again? (yes/no): ";
        cin >> ans;
    } while ((ans != 'n') && (ans != 'N'));

    return 0;
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

void newLine()
{
    using namespace std;
}