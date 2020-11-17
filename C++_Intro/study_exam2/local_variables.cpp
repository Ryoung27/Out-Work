#include <iostream>
using namespace std;

double estTotal(int minPeas, int maxPeas, int podCount);

int main()
{
    int maxCount, minCount, podCount;
    double averagePea, yield;

    cout << "Enter minimum and maximum number of peas in a pod: ";
    cin >> minCount >> maxCount;
    cout << "Enter the number of pods: ";
    cin >> peaCount;
    cout << "Enter the weight of an average pea (in ounces): ";
    cin >> averagePea;

    yield = estTotal(minCount, maxCount, podCount) * averagePea;

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(3);
    cout << "Min number of peas per pod = " << minCount << endl
         << "Max number of peas per pod = " << maxCount << endl
         << "Pod count = " << podCount << endl
         << "Average pea weight = "
         << averagePea << " ounces " << endl
         << "Estimated average yield = " << yield << " ounces"
         << endl;

    return 0;
}

double estTotal(int minPeas, int maxPeas, int podCount)
{
    double averagePea;

    averagePea = (maxPeas + minPeas) / 2.0;
    return (podCount * averagePea);
}