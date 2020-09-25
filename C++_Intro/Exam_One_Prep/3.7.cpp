#include <iostream>
using namespace std;


int main()
{
    int choice;

    do
    {
        cout << endl
             << "Choose 1 to see the next homework assignment.\n"
             << "Choose 2 for your grade on the last assignment.\n"
             << "Choose 3 for assignment hints.\n"
             << "Choose 4 to exit this program.\n"
             << "Enter your choice and press Return. ";
        cin >> choice;

        switch(choice)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                cout << "End of program.\n";
                break;
            default:
                cout << "Not a valid choice.\n"
                     << "Choose again.\n";
        }
    } while (choice != 4);

    return 0;
}