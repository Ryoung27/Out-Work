#include <iostream>
#include <iomanip>

const int NUMBER_STUDENTS = 4, NUMBER_QUIZZES = 3;

void computeStAve(const int grade[][NUMBER_QUIZZES], double stAve[]);

void computeStAve(const int grade[][NUMBER_QUIZZES], double quizAve[]);

void display(const int grade[][NUMBER_QUIZZES], const double stAve[], const double quizAve[]);

int main()
{
    using namespace std;
    int grade[NUMBER_STUDENTS][NUMBER_QUIZZES];
    double stAve[NUMBER_STUDENTS];
    doublt quizAve[NUMBER_QUIZZES];
}