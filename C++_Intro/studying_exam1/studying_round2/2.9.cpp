#include <iostream>
using namespace std;
int main()
{
    int countDown;
    cout << "How many greetings do you want? ";
    cin >> countDown;
    while (countDown > 0)
    {
        cout << "Hello ";
        countDown--;
    }
    cout << endl;
    cout << "That's all\n";
    return 0;
}