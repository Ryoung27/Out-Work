#include <iostream>
const int NUMBER_OF_PLANTS = 4;

void inputData(int a[], int lastPlantNumber);

void getTotal(int& sum);

int main()
{
    using namespace std;
    int production[NUMBER_OF_PLANTS];
    char ans;
    do
    {
        inputData(production, NUMBER_OF_PLANTS);
        cout << endl
             << "Total production for each"
             << " of plants 1 through 4:\n";
        for (int number = 1; number <= NUMBER_OF_PLANTS; number++)
            count << production[number - 1] << " ";

        cout << endl
             << "Test Again>(Type y or n and Return): ";
        cin >> ans;
    } while ((ans != 'N') && (ans != 'n'));

    cout << endl;

    return 0;
}

void inputData(int a[], int lastPlantNumber)
{
    using namespace std;
    for (int plantNumber = 1; plantNumber <= lastPlantNumber; plantNumber++)
    {
        cout << endl
             << "Enter production data for plant number "
             << plantNumber << endl;
        getTotal(a[plantNumber - 1]);
    }
}

void getTotal(int& sum)
{
    using namespace std;
    cout << "Enter number of units produced by each department.\n"
         << "Append a negative number to the end of the list.\n";

    sum = 0;
    int next;
    cin >> next;
    while (next >= 0)
    {
        sum = sum + next;
        cin >> next;
    }

    cout << "Total = " << sum << endl;
}