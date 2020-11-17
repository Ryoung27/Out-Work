// Author: Ronnie Young
// Date: November 9th 2020
// Class: CSCI 121
// Project: Project 08
// The purpose of this project is to help the students to reinforce the knowledge from Chapter 8 of
// the textbook.


#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <numeric>
#include <cctype>

using namespace std;

//Problem 1 functions.

void get_scores(vector<int> &v);
// get integer scores from keyboard and store in v.
// we assume that the user will input scores in range
// of 0 to 100, inclusive. User enter a negative
// number to stop the input and end the function

void print_stats(vector<int> &v);
// print out the stats of data that are stored in v
// includes: max, min, total number of data,
// and the average

//Problem 2 function.

bool is_palindrome(string sentence);
// return true if the sentence is a palindrome;
// false otherwise

int main()
{
    vector<int> v;
    char cont = 'Y';
    char palindrome_cont = 'Y';
    string sentence;
    string string_original_sentence;

    while(cont == 'Y' || cont == 'y')
    {
        get_scores(v);

        print_stats(v);

        cout << "Do you want to try another set of scores? (y/n)" << endl;
        cin >> cont;
    }

    while(palindrome_cont == 'Y' || palindrome_cont == 'y')
    {
        cout << "Enter a sentence: " << endl;
        cin.ignore();
        getline(cin, sentence);
        string_original_sentence = sentence;
        transform(sentence.begin(), sentence.end(), sentence.begin(), ::tolower);

        if(is_palindrome(sentence) == true){
            cout << string_original_sentence << " is a palindrome" << endl;
        }
        else{
            cout << string_original_sentence << " is not a palindrome" << endl;
        }

        do
        {
            cout << "Do you want to try another sentence? (y/n)" << endl;
            cin >> palindrome_cont;
        }while(palindrome_cont != 'y' && palindrome_cont != 'Y' &&  palindrome_cont != 'n' && palindrome_cont != 'N');
    }
    return 0;
}

//Get the scores for the vector.
void get_scores(vector<int> &v)
{
    int next;
    int count(0);

    cout << "Enter scores, enter -1 to stop:" << endl;
    cin >> next;

    while (next > 0 && count <= 100)
    {
        v.push_back(next);
        cin >> next;
        count++;
    }
    cout << "There are a total " << v.size() << " scores." << endl;

    return;
}

// Print the stats from the vector, max, mini, and average of all values.
void print_stats(vector<int> &v)
{
    if(v.size() > 0){
        cout << "The maximum score is " << *max_element(v.begin(), v.end()) << "." << endl;
        cout << "The minimum score is " << *min_element(v.begin(), v.end()) << "." << endl;
        cout << "The average score is " << accumulate( v.begin(), v.end(), 0) / v.size() << "." << endl;
    }
    return;
}

// Function to check if a given sentence is a palindrome
bool is_palindrome(string sentence)
{
    size_t len = sentence.length();

    for(int i = 0; i < len/2; i++){
        if(sentence[i] != sentence[len-1-i]){
            return false;
        }
    }
    return true;
}



// Sample output
// Enter scores, enter -1 to stop:
// 87
// 98
// 65
// 78
// 88
// 93
// -1
// There are a total 6 scores.
// The maximum score is 98.
// The minimum score is 65.
// The average score is 84.
// Do you want to try another set of scores? (y/n)
// n
// Enter a sentence:
// A nut for a jar of tuna
// A nut for a jar of tuna is not a palindrome
// Do you want to try another sentence? (y/n)
// y
// Enter a sentence:
// Hello world
// Hello world is not a palindrome
// Do you want to try another sentence? (y/n)
// n