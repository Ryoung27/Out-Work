// Comments
// Author: Ronnie Young
// Date: September 8 2020
// Class: CSCI 121
// Project: Project 03
/* This is a C++ program that plays a game of 23.
 CSCI 121 Computer Science I */

#include <iostream>
using namespace std;

int main()
{
    int toothpicks;
    int human_pick;
    int computer_pick;
    bool human_won = true;
    char play_again = 'Y';
    // A while loop wrapped around the entire function.
    // This is so the user can rerun the program multiple times.
    while(play_again == 'Y' || play_again == 'y')
    {
        toothpicks = 23;
        cout << "Let's play a game of \"23\"!\n";
        // The while loop to run it as long as the sticks are greater than 23.
        while(toothpicks > 0){
            // Ask for input.
            cout << "Enter the number of sticks you wish to pick: ";
            cin >> human_pick;
            //Detect if the user has input a valid answer.
            while(human_pick > 3 || human_pick < 1)
            {
                cout << "Wrong number of sticks. Please pick 1, 2, or 3 sticks:";
                cin >> human_pick;
            }
            //Calculate the number of sticks after player input.
            toothpicks -= human_pick;
            // Check if someone lost after each pick.
            if(toothpicks <= 0)
            {
                cout << "You picked the last stick.\n";
                cout << "Sorry the computer beat you!\n";
                human_won = false;
                break;
            }
            else
            {
                cout << "You picked " << human_pick << " sticks. " << toothpicks << " left.\n";
            }

            //Computers logic for the number of toothpicks it picks.
            if(toothpicks > 4)
            {
                computer_pick = 4 - human_pick;
            }
            else if( toothpicks > 1 && toothpicks < 5)
            {
                if(toothpicks == 4)
                {
                    computer_pick = 3;
                }
                else if(toothpicks == 3)
                {
                    computer_pick = 2;
                }
                else if(toothpicks == 2)
                {
                    computer_pick = 1;
                }
            }
            else
            {
                computer_pick = 1;
            }
            toothpicks -= computer_pick;

            // Check if someone lost after each pick.
            if(toothpicks <= 0 && human_won == true)
            {
                cout << "The computer picked the last stick.\n";
                cout << "You won!\n";
                break;
            }
            else
            {
                cout << "Computer picked " << computer_pick << " sticks. " << toothpicks << " left.\n";

            }

        }
        cout << "Do you want to play again?(Y/N): \n";
        cin >> play_again;
    }
    return 0;
}

//Sample Run: Computer Wins.
// Let's play a game of "23"!
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 20 left.
// Computer picked 1 sticks. 19 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 16 left.
// Computer picked 1 sticks. 15 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 12 left.
// Computer picked 1 sticks. 11 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 8 left.
// Computer picked 1 sticks. 7 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 4 left.
// Computer picked 3 sticks. 1 left.
// Enter the number of sticks you wish to pick: 3
// You picked the last stick.
// Sorry the computer beat you!
// Do you want to play again?(Y/N):
// N



//Sample Run: Human Wins.
// Let's play a game of "23"!
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 20 left.
// Computer picked 1 sticks. 19 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 16 left.
// Computer picked 1 sticks. 15 left.
// Enter the number of sticks you wish to pick: 3
// You picked 3 sticks. 12 left.
// Computer picked 1 sticks. 11 left.
// Enter the number of sticks you wish to pick: 2
// You picked 2 sticks. 9 left.
// Computer picked 2 sticks. 7 left.
// Enter the number of sticks you wish to pick: 2
// You picked 2 sticks. 5 left.
// Computer picked 2 sticks. 3 left.
// Enter the number of sticks you wish to pick: 2
// You picked 2 sticks. 1 left.
// The computer picked the last stick.
// You won!
// Do you want to play again?(Y/N):
// N