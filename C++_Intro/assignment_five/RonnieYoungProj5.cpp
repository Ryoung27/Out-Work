// Comments
// Author: Ronnie Young
// Date: October 02 2020
// Class: CSCI 121
// Project: Project 05
/* This project will help the students to reinforce the knowledge from Chapter 5 of the textbook.

1. Understand and apply top-down design concept

2. Implement the functions according to specified requirements

3. Test and debug the functions
 CSCI 121 Computer Science I */

#include <iostream>

void testMenu();
// Prints out the menu opitions for the test menu.

bool isLeapYear(int year);
// Pre Condition:
// Year has an int value that has been validated.

// Post Condition:
// Returns a boolean value of true if the year is a leap year.
// If the year is not a leap year it returns false.

int getCenturyValue(int year);
// Pre Condition:
// Year has an int value that has been validated.

// Post Condition:
// Returns the century value for the year.

int getYearValue(int year);
// Pre Condition:
// Year has an int value that has been validated.

// Post Condition:
// Returns the year value for the year.

int getMonthValue(int month, int year);
// Pre Condition:
// Both month and year have an int value that has been validated.

// Post Condition:
// Returns the value of the month.

int dayOfWeek(int month, int day, int year);
// Pre Condition:
// Month, day, and year have an int value that has been validated.

// Post Condition:
// Returns the day of the week value.

std::string dayOfWeek(int day);
// Pre Condition:
// Day has int value 0, 1, 2, 3, 4, 5, or 6

// Post Condition:
// The name of the day of week is returned as a std::. If day
// has value 0, then SUNDAY is returned; 1, then MONDAY is returned; and so on.

void getInput(int& month, int& day, int& year);
// Pre Condition:
// Month, day, and year are valid ints.

// Post Condition:
// Returns the month, day, and year.


int main()
{
    using namespace std;
    int choice;
    int day, month, year;
    // Create a do while loop that runs while choice != 7;
    do
    {
        // Call the testMenu function, which creates a menu for users to select from.
        testMenu();
        cout << "Please choose from the menu: ";
        cin >> choice;
        switch(choice)
        {
            case 1: // check if a given year is leap year
                cout << "Please enter a year: ";
                cin >> year;
                if(year > 1582){
                    if (isLeapYear(year))
                        cout << "Year " << year << " is a leap year" << endl;
                    else
                        cout << "Year " << year << " is NOT a leap year" << endl;
                    break;
                }
                else
                    cout << "You have input an invalid year, please try a year after 1582." << endl;
                    break;
            case 2: // calculate the century value of a given year
                cout << "Please enter a year: ";
                cin >> year;
                if(year > 1582){
                    cout << "The century value is: " << getCenturyValue(year) << endl;
                    break;
                }
                else
                    cout << "You have input an invalid year, please try a year after 1582." << endl;
                    break;
            case 3: // calculate the year value of a given year
                cout << "Please enter a year: ";
                cin >> year;
                if(year > 1582){
                    cout << "The year value is: " << getYearValue(year) << endl;
                    break;
                }
                else
                    cout << "You have input an invalid year, please try a year after 1582." << endl;
                    break;
            case 4: // calculate the month value of a given month in a given year
                cout << "Please enter a year and month: ";
                cin >> year >> month;
                if(year > 1582){
                    if(month >= 1 && month < 13){
                        cout << "The month value is: " << getMonthValue(month, year) << endl;
                        break;
                    }
                    else
                        cout << "The month is only valid between 1-12" << endl;
                        break;
                }
                else
                    cout << "You have input an invalid year, please try a year after 1582." << endl;
                    break;
            case 5: // calculate the day of week of a given date
                cout << "Please enter a month, a day, and a year : ";
                getInput(month, day, year);
                if(year > 1582){
                    if(month >= 1 && month < 13){
                        if(day > 0 && day < 32){
                            cout << "The day of the week is: " << dayOfWeek(month, day, year) << endl;
                            break;
                        }
                        else
                            cout << "The day is only valid between 0-31" << endl;
                            break;
                    }
                    else
                        cout << "The month is only valid between 1-12" << endl;
                        break;
                }
                else
                    cout << "You have input an invalid year, please try a year after 1582." << endl;
                    break;
            case 6: // print out the name of a given day of week
                cout << "Please enter a day of week (0 for Sunday, 1 for Monday etc): " << endl;
                cin >> day;
                if(day >= 0 and day < 7){
                    cout << "The name of the day of the week is: " << dayOfWeek(day)<< endl;
                    break;
                }
                else
                    cout << "The day is only valid between 0-7" << endl;
                    break;
            case 7:
                cout << "Did you test all the functions yet? If not please go back and rerun the program." << endl;
                break;
            default:
                cout << "Wrong option. Please choose from menu:\n";
                break;
        }


    } while(choice != 7);

}

// Definition uses iostream:
// Function definition.

void testMenu()
{
    using namespace std;
    cout << "**************************************************" << endl;
    cout << "* Test Menu *" << endl;
    cout << "Please select from the below listed options (1-7):" << endl;
    cout << "1: Check if the given year is a leap year." << endl;
    cout << "2: Calculate the century value of a year." << endl;
    cout << "3: Calculate the year value of a year." << endl;
    cout << "4: Calculate the month value of a given month in a given year." << endl;
    cout << "5: Calculate the day of week of a given date." << endl;
    cout << "6: Print the name of a given day of week." << endl;
    cout << "7: Exit Program." << endl;
    cout << "**************************************************" << endl;
    return;
}

bool isLeapYear(int year)
{
    return year % 400 == 0 || (year % 400 == 0 && year % 100 != 0);
}

int getCenturyValue(int year)
{
    if(year > 1000 && year < 10000)
        return (3 - ((year/100) % 4)) * 2;
    else if(year > 10000 && year < 10000)
        return (3 - ((year/1000) % 4)) * 2;
}

int getYearValue(int year)
{
    return (year % 100) + ((year % 100) /4);
}

int getMonthValue(int month, int year)
{
    switch(month)
    {
        case 1:
            if (isLeapYear(year))
                return 6;
        case 10:
            return 0;
        case 5:
            return 1;
        case 8:
            return 2;
        case 2:
            if (isLeapYear(year))
                return 2;
        case 3:
        case 11:
            return 3;
        case 6:
            return 4;
        case 9:
        case 12:
            return 5;
        case 4:
        case 7:
            return 6;
        default:
            return -1;
    }
}

int dayOfWeek(int month, int day, int year){
    return ( (day + getMonthValue(month, year) + getYearValue(year) + getCenturyValue(year)) % 7);
}

std::string dayOfWeek(int day)
{
    using namespace std;
    string days[7] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    return days[day];
}

void getInput(int& month, int& day, int& year)
{
    using namespace std;
    cin >> month >> day >> year;
    return;
}


// Out put:
/*
1 warning generated.
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 1
Please enter a year: 1900
Year 1900 is NOT a leap year
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 2
Please enter a year: 2000
The century value is: 6
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 3
Please enter a year: 2008
The year value is: 10
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 4
Please enter a year and month: 2016 10
The month value is: 0
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 5
Please enter a year, a month, and a day : 2016 10 12
The day of the week is: 3
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 6
Please enter a day of week (0 for Sunday, 1 for Monday etc):
3
The name of the day of the week is: Wednesday
**************************************************
* Test Menu *
Please select from the below listed options (1-7):
1: Check if the given year is a leap year.
2: Calculate the century value of a year.
3: Calculate the year value of a year.
4: Calculate the month value of a given month in a given year.
5: Calculate the day of week of a given date.
6: Print the name of a given day of week.
7: Exit Program.
**************************************************
Please choose from the menu: 7
Did you test all the functions yet? If not please go back and rerun the program.

*/