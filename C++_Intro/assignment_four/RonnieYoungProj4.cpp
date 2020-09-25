// Comments
// Author: Ronnie Young
// Date: September 21 2020
// Class: CSCI 121
// Project: Project 04
/* This is a C++ program that takes a depth in kilometers inside the earth as input data; calculate and display
the temperature at this depth in both degrees Celsius and degree Fahrenheit.
 CSCI 121 Computer Science I */

#include <iostream>
using namespace std;

// prints out information to tell the user what this program does.
void print_introduction();

// getting a lot of bad inputs and want to check them again values.
double check_input();

// computes and returns the celsius temperature at a depth measured in kilometers.
double celsius_at_depth(double depth);

// converts a Celsius temperature celsius to Fahrenheit.
double celsius_to_fahrenheit(double celsius);

// display the conclusion that what is the temperature in both Celsius and Fahrenheit at depth of the earth.
void print_conclusion(double depth);

// Ask the user if they want to rerun the program. If they do call main again.
void rerun();

int main()
{
    using namespace std;

    double depth;

    print_introduction();

    depth = check_input();

    print_conclusion(depth);

    rerun();

    return 0;
}

void print_introduction()
{
    using namespace std;
    cout << "Hello! The program will tell you the temperature of the earth at any depth.";
}

double check_input()
{
    using namespace std;

    double depth;

    // This is the depth to the core of the earth.
    const double EARTH_DEPTH = 6371;

    // I have yet to check input as of 08/24
    cout << "Please enter a depth in KM: ";
    cin >> depth;
    // This verifies our input is a number and not a string or char.
    while(1)
    {
        if(cin.fail() || depth < 0)
        {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(),'\n');
            cout << "You have entered wrong input, please use a number."<<endl;
            cin>>depth;
        }
        if(!cin.fail())
            break;
    }

    // 6371 is the depth to the center.
    // 6371 * 2 is the depth of one side to the other.
    if(depth > EARTH_DEPTH && (depth < EARTH_DEPTH * 2))
    {
        // This formula works out if you went deeper than the core.
        cout << "You have went through the core and are on path to the other side of the earth.\n";
        depth = EARTH_DEPTH - (depth - EARTH_DEPTH);
    }
    else if(depth > EARTH_DEPTH * 2)
    {
        cout << "That's too many Kilometers.\n";
        cin.clear();
        cout << "Please enter a depth less than " << EARTH_DEPTH * 2 << " (the depth of the earth from crust to crust) : ";
        cin>>depth;

        if(depth > EARTH_DEPTH && (depth < EARTH_DEPTH * 2))
        {
            // This formula works out if you went deeper than the core.
            cout << "You have went through the core and are on path to the other side of the earth.\n";
            depth = EARTH_DEPTH - (depth - EARTH_DEPTH);
        }
    }
    return depth;
}

double celsius_at_depth(double depth)
{
    return (10 * depth + 20);
}

double celsius_to_fahrenheit(double celsius)
{
    return (1.8 * celsius + 32);
}

void print_conclusion(double depth)
{
    using namespace std;

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    cout << "The temperature of the earth at a depth of " << (int)depth << " KM  is " << (int)celsius_at_depth(depth) << " in Celsius, and " << (int)celsius_to_fahrenheit(celsius_at_depth(depth)) << " in Fahrenheit.\n";
}


void rerun()
{
    using namespace std;
    char rerun;

    while(!(rerun == 'Y' || rerun == 'y' ||  rerun == 'N' || rerun == 'n'))
    {
        cout << "Would you like to do it again? (Y/N): \n";
        cin >> rerun;
        if (rerun == 'Y' || rerun == 'y')
            main();
    }


}