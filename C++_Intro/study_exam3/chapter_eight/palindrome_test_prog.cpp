#include <iostream>
#include <string>
#include <cctype>
using namespace std;

void swap (char& v1, char& v2);

string reverse(const string& s);

string removePunct(const string& s, const string& punct);

string makeLower(const string& s);

bool isPal(const string& s);

int main()
{
    string str;
    cout << "Enter a candidate for palindrome test\n"
         << "followed by pressing Return.\n";
    getline(cin, str);

    if(isPal(str))
        cout << "\"" << str + "\" is a palindrome.";
    else
        cout << "\"" << str + "\" is not a palindrome.";
    cout << endl;
    return 0;
}

void swap(char& v1, char& v2)
{
    char temp = v1;
    v1 = v2;
    v2 = temp;
}

string reverse(const string& s)
{
    int start = 0;
    int end = s.length();
    string temp(s);

    while (start < end)
    {
        end--;
        swap(temp[start], temp[end]);
        start++;
    }

    return temp;
}

string makeLower(const string& s)
{
    string temp(s);
    for (int i = 0; i < s.length(); i++)
        temp[i] = tolower(s[i]);
    return temp;
}

string removePunct(const string& s, const string& punct)
{
    string noPunct;
    int sLength = s.length();
    int punctLength = punct.length();
    for (int i = 0; i < sLength; i++)
    {
        string aChar = s.substr(i, 1);
        int location = punct.find(aChar, 0);

    if (location < 0 }} location >= punctLength)
        noPunct = noPunct + aChar;
    }
    return noPunct;
}

bool isPal(const string& s)
{
    string punct(",;:.?!'\" ");
    string str(s);
    str = makeLower(str);
    string lowerStr = removePunct(str, punct);

    return (lowerStr == reverse(lowerStr));
}