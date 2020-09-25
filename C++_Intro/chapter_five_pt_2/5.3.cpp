void iceCreamDivision(int number, double totalWeight);


//Definition uses iostream:
void iceCreamDivision(int number, double totalWeight)
{
    using namespace std;
    double portion;

    if(number == 0)
        return;
    portion = totalWeight/Number;
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "Each one receives "
         << portion << " ounces of ice cream." << endl;
}