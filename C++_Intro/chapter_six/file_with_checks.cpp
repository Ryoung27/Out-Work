#include <fstream>
#include <iostream>
#include <cstdlib>

int main(){
    using namespace std;
    ifstream inStream;
    ofstream outStream;
    inStream.open("infile.data");
    if(inStream.fail())
    {
        cout << "Input file opening failed.\n";
        exit(1);
    }
    outStream.open("outfile.dat");
    if(outStream.fail())
    {
        cout << "Output file opening failed.\n";
        exit(1);
    }
    int first, second, third;
    inStream >> first >> second >> third;
    outStream << "The sum of the first 3\n"
              << "numbers in infile.dat\n"
              << "is " << (first + second + third)
              << endl;
    inStream.close();
    outStream.close();
    return 0;
}