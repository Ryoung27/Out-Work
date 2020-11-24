#include <iostream>
#include <string>
#include <cctype>

using namespace std;

// void swap(char& v1, char& v2);

// string reverse(const string& s);

// string removePunct(const string& s, const string& punct);

// string makeLower(const string& s);

// bool isPal(const string& s);

void f1(int n);

int main()
{
    f1(1234);
    // cout << "This is f1" << endl;
    // cout << f1(1234) << endl;
    // cout << "That was f1" << endl;
    // string str;

    // cout << "Enter a candidate for palindrome test\n"
    //      << "followed by pressing Return.\n";
    // getline(cin, str);

    // if(isPal(str))
    //     cout << "\"" << str + "\" is a palindrome.";
    // else
    //     cout << "\"" << str + "\" is not a palindrome.";
    // cout << endl;

    // return 0;
}

void f1(int n)
{
    if(n == 0) return;
    f1(n/10);
    cout << n % 10 << endl;
}

// void swap(char& v1, char& v2)
// {
//     char temp = v1;
//     v1 = v2;
//     v2 = temp;
// }

// string reverse(const string& s)
// {
//     int start = 0;
//     int end = s.length();
//     string temp(s);

//     while(start < end)
//     {
//         end--;
//         swap(temp[start], temp[end]);
//         start++;
//     }

//     return temp;
// }

// string makeLower(const string& s)
// {
//     string temp(s);
//     for (int i = 0; i < s.length(); i++)
//         temp[i] = tolower(s[i]);
//     return temp;
// }

// string removePunct(const string& s, const string& punct)
// {
//     string noPunct;
//     int sLength = s.length();
//     int punctLength = punct.length();

// }

