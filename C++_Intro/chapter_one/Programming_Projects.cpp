#include <iostream>
using namespace std;

int main()
{
    int numberOne, numberTwo, answer;
    cout << "Press return after entering a number. \n";
    cout << "Please enter the first number you would like summed. \n";
    cin >> numberOne;
    cout << "Please enter the second number you would like summed. \n";
    cin >> numberTwo;
    answer = numberOne + numberTwo;
    cout << answer;
    cout << " Good bye world.\n";
    return 0;
}