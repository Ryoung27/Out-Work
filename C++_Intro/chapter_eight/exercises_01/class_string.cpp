#include <iostream>
#include <string>
using namespace std;

int main()
{
    string phrase;
    string adjective("fried"), noun("ants");
    string random("Test"), another("Test");
    string test = "TESTINGTON BEAR";
    string wish = "Bon appetit!";

    phrase = "I love " + adjective + " " + noun + "!";
    cout << phrase << endl
         << wish << endl;

    cout << "This is a random " << random << " and this is another random " << another << endl;
    cout << "A funny name is " << test;

    return 0;
}