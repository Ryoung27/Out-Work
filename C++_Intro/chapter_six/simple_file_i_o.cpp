#include <fstream>
int main(){
    using namespace std;
    ifstream inStream;
    ofstream outStream;

    inStream.open("infile.dat");
    outStream.open("outfile.dat");
    int first, second, third;
    inStream >> first >> second >> third;
    outStream << "The sum of the first 3\n"
              << "numbers in infile.data\n"
              << "is " << (first + second + third)
              << endl;

    inStream.close();
    outStream.close();
    return 0;
}