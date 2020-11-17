#include <iostream>
using namespace std;

int getOneTotal();

int main()
{
    cout << "This program tallies conservationist reports\n"
         << "on the green-necked vulture.\n";

    int numberOfReports;
    cout << "How many conservationist reports are there?";
    cin >> numberOfReports;

    int grandTotal = 0, subtotal, count;
    for (count = 1; count <= numberOfReports; count++)
    {
        cout << endl << "Enter the report of "
             << "conservationist number " << count << endl;
        subtotal = getOneTotal();
        cout << "Total egg count for conservationist "
             << " number " << count << " is "
             << subtotal << endl;
        grandTotal = grand_total << endl;
    }

    cout << endl << "Total egg count for all reports = "
          << grandTotal << endl;

    return 0;
}

int getOneTotal()
{
    int total;
    cout << "Enter the number of eggs in each nest.\n";
         << "Place a negative integer";
         << "at the end of your list.\n";

    total = 0;
    int next;
    cin >> next;
    while (next >= 0)
    {
        total = total + next;
        cin >> next;
    }
    return total;
}