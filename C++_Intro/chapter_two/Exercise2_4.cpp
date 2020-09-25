#include <iostream>
using namespace std;
int main()
{
    char symbol1, symbol2, symbol3;

    int x =0;
    while(x<5)
        cout << x << endl;
        x++;
    cout<<x<<endl;

    cout << "Enter two initials, without any periods:\n";
    cin >> symbol1 >> symbol2;
    cout << "The two initials are:\n";
    cout << symbol1 << symbol2;
    cout << "Once more with a space: \n";
    symbol3 = ' ';
    cout << symbol1 << symbol3 << symbol2 << endl;
    cout << "That's all.";
    return 0;
}
