#include <iostream>
using namespace std;
int main()
{
String value = " ";
String i;
String j;
int count = 0;
cin >> value;

while(!(value == "xxxxx"))
{
    j = i;
    i = value;
    if(i == j)
    {
        count = count + 1;
    }
    cin >> value;
}
    cout << count;
}
//fish bird reptile reptile bird bird bird mammal fish
//"3 11 5 5 5 2 4 6 6 7 3 -8"
// int positive;
// int total;
// cin >> positive;

// while(positive > 0)
// {
// 	if(positive % 2 == 0){
//     	total+=positive;
// 	}
// 	cin >> positive;
// }
// cout << total;