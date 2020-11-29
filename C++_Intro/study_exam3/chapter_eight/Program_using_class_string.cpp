#include <iostream>
#include <string>
using namespace std;

int main()
{
    string phrase;
    string adjective("fried"), noun("ants");
    string wish = "Bon appetit!";

    phrase = "I love " + adjective + " " + noun + ".\n";
    cout << phrase + wish;
    return 0;
}