// Author: Ronnie Young
// Date: November 19th 2020
// Class: CSCI 121
// Project: Project 09
// The purpose of this project is to help the students to reinforce the knowledge from Chapter 14 of
// the textbook.
#include <iostream>
using namespace std;


int sum(int n);
// Recursive version to calculate the sum of
// 1 + 2 + .... + n
// For str_length:
// option 1:
void return_length(const char s[]);
// Prints the results of str_length to std out using one perimeter.

int str_length(const char s[]);
// Recursive version of strlen in C strings.
// It returns the length of the string s[].
// (the null character, '\0', is not counted in the length)

int str_length(char s[], int counter);
// Option 2.

int main(){
    using namespace std;
    char s[80];
    char repeat;
    int numb;

    do
    {
        cout << "Please enter a positive integer: ";
        cin >> numb;
        cout << sum(numb) << endl;

        cout << "Please enter a sentence: ";
        cin.ignore();
        cin.getline(s, 80);

        return_length(s);

        do
        {
            cout << "Do you want to have another run? (y/n)" << endl;
            cin >> repeat;
        }while(repeat != 'y' && repeat != 'Y' &&  repeat != 'n' && repeat != 'N');
    } while(repeat == 'y' || repeat == 'Y');

    cout << "Program ended with exit code : 0" << endl;
    return 0;
}

int sum(const int n)
{
    using namespace std;

    if (n==0)
        return 0;
    else
        return (n + sum(n-1));
}

void return_length(const char s[])
{
    using namespace std;
    int counter = 0;

    cout << "It contains " << str_length(s) << " chararacters including white space." << endl;

    return;
}

int str_length(const char s[])
{
    using namespace std;

    if (s[0] != '\0')
        return(1 + str_length(s+1));
    else
        return 0;

}

int str_length(char s[], int counter)
{

    while (s[counter] != '\0')
        ++counter;
    return counter;
    }

//Test Run:
// Please enter a positive integer: 10
// 55
// Please enter a sentence: Hello World!
// It contains 12 chararacters including white space.
// Do you want to have another run? (y/n)
// y
// Please enter a positive integer: 100
// 5050
// Please enter a sentence: I love programming!
// It contains 19 chararacters including white space.
// Do you want to have another run? (y/n)
// n
// Program ended with exit code : 0