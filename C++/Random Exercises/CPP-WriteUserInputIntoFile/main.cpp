/*
Ask the user for input
Save input as string
Save as file
*/

#include <iostream>
#include <fstream>
using namespace std;

void checkInput(){
    //Code
}


int main(){

    ofstream file("test.txt");
    //file.open("test.txt");
    string text = "NULL";
    cout << "Please introduce whatever you want to save as a file." << endl;
    cin >> text;
    file << text;
    file.close();


return 0;
}