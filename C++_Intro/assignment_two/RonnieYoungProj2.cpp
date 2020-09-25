// Comments
// Author: Ronnie Young
// Date: August 24 2020
// Class: CSCI 121
// Project: Project 02
/* This is a C++ program that takes in gender, age, weight, and height and returns there BMR and how
many average chocolate bars that it would take to maintain weight.
 CSCI 121 Computer Science I */

#include <iostream>
using namespace std;
int main()
{
    char gender; //Users answer to gender.
    char another_run = 'Y'; //Set to Y, so any input will break the loop, but we assume anything, but Y means break.
    int weight, height, age; //Set weight, height, and age to int.
    double BMR;
    // A while loop wrapped around the entire function.
    // This is so the user can rerun the program multiple times.
    while(another_run == 'Y' || another_run == 'y')
    {
    // Greet the user.
    cout << "Welcome to my BMR calculator.\n";
    // Ask their gender.
    cout << "Gender (M or F): ";
    cin >> gender;
        // While the user isn't putting in a gender.
        while (!(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f'))
        {
            cout << "Wrong gender input. Please enter again. Gender (M or F): ";
            cin >> gender;
        }
        // Once the user puts in some variation of M or F. Find out their weight, height, and age.
        cout<< "Please enter your weight(in pounds): ";
        cin >> weight;

        cout<< "Please enter your height(in inches): ";
        cin >> height;

        cout<< "Please enter your age(in years): ";
        cin >> age;
        // If the user is Male, use the male calculations.
        if(gender == 'M' || gender == 'm')
        {
            BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
            cout << "He needs " << BMR << " calories to maintain his weight.\n";
        }
        // If the user is Female, use the male calculations.
        else if(gender == 'F' || gender == 'f')
        {
            BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
            cout << "She needs " << BMR << " calories to maintain her weight.\n";
        }
    //Use BMR to return chocolate values.
    cout << "That is about " << BMR/230 << " chocolate bar's calories.\n";
    //Ask if they want to run again.
    cout << "Do you want to do another calculatin?(Y/N): ";
    cin >> another_run;
    }
    // If they don't want to say good bye.
    cout << "Thanks for using my BMR calculator. Good bye!\n";

    return 0;
}