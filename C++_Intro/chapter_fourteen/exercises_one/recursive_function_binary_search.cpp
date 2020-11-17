//Program to demonstrate the recursive function for binary search.

#include <iostream>
using namespace std;
const int ARRAY_SIZE = 10;


void search(const int a[], int first, int last, int key, bool& found, int& location);
//Precondition: a[first] through a[last] are sorted in increasing order.
//Postcondition: if key is not one of the values a[first] through a[last],
//then found == false; otherwise, a[location] == key and found == true.

int main()
{
    int a[ARRAY_SIZE];
    const int finalIndex = ARRAY_SIZE - 1;
}