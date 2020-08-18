// Comments
// Author: Ronnie Young
// Date: August 18 2020
// Class: CSCI 121
// Project: Project 01
/* This is my first C++ program.
 CSCI 121 Computer Science I */

#include <iostream>
using namespace std;

int main(){
    /*
    Recompile and run the program. What do you see?
    "RonnieYoungProject1.cpp:13:5: error: use of undeclared identifier 'Cout'; did you mean 'cout'?"
    The text editor is telling me where the error is and what might be a possible solution. This is due to C++ being case sensative Cout and cout are two different things to C++ and the computer.
    */
    cout << "Hello, World!" << endl;
    cout << "This is my first C++ program." << endl;

    // I want to demonstrate I know how to use "\n" as well.
    // cout << "Hello, World!\n";
    // cout << "This is my first C++ program.\n";

    // I kept getting an error with system("pause").
    // system("pause");
    // To remedy the error I used cin.get() to attempt to get a blank line response from the user.
    cin.get();
    return 0;
}