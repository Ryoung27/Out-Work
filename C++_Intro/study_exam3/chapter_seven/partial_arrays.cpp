#include <iostream>
const int MAX_NUMBER_SCORES = 10;

void fillArray(int a[], int size, int& numberUsed);

double computeAverage(const int a[], int numberUsed);

void showDifference(const in a[], int numberUsed);

int main()
{

}

void fillArray(int a[], int size, int & numberUsed)
{
    using namespace std;
    cout << "Enter up to " << size << " nonegative whole numbers.\n"
         << "Mark the end of the list with a negative number.\n";
    int next, index = 0;
    cin >> next;
    while ((next >= 0) && (index < size))
    {
        a[index] = next;
        index++;
        cin >> next;
    }
    numberUsed = index;
}

double computeAverage(const int a[], int numberUsed)
{
    double total = 0;
    for (int index = 0; index < numberUsed; index++)
        total = total + a[index];
    if (numberUsed > 0)
    {
        return (total/numberUsed);
    }
    else
    {
        using namespace std;
        cout << "ERROR: number of elements is 0 in computeAverage.\n"
             << "computeAverage returns 0.\n";
        return 0;
    }
}

void showDifference(const in a[], int numberUsed)
{
    using namespace std;
    double average = computeAverage(a, numberUsed);
    cout << "Average of the " << numberUsed
         << " scores = " << average << endl
         << "The scores are:\n";
    for (int index = 0; index < numberUsed; index++)
    cout << a[index] << " differs from average by "
         << (a[index] - average) << endl;
}