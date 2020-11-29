#include <iostream>
#include <string>
using namespace std;

int main()
{
    string firstName, lastName;

    cout << "Enter your first and last name: \n";
    cin >> firstName >> lastName;

    cout << "Your last name is spelled:\n";
    int i;
    for (i = 0; i < lastName.length(); i++)
    {
        cout << lastName[i] << " ";
        lastName[i] = '-';
    }
    cout << endl;
    for (i = 0; i < lastName.length(); i++)
        cout << lastName[i] << " ";
    cout << endl;

    cout << "Good day " << firstName << endl;
    return 0;
}