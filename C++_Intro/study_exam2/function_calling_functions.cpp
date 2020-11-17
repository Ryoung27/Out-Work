#include <iostream>

void getInput(int& input1, int& input2);

void swapValues(int& variable1, int& variable2);

void order(int& n1, int& n2);

void giveResults(int output1, int output2);

int main()
{
    int firstNum, secondNum;
    getInput(firstNum, secondNum);
    order(firstNum, secondNum);
    giveResults(firstNum, secondNum);
    return 0;
}

void getInput(int& input1, int& input2)
{
    using namespace std;
    cout << "Enter two integers: ";
    cin >> input1 >> input2;
}

void swapValues(int& variable1, int& variable2)
{
    int temp;

    temp = variable1;
    variable1 = variable2;
    variable2 = temp;
}

void order(int& n1, int& n2)
{
    if (n1 > n2)
        swapValues(n1, n2);
}

void giveResults(int output1, int output2)
{
    using namespace std;
    cout << "In increasing order the numbers are: "
         << output1 << " " << output2 << endl;
}

