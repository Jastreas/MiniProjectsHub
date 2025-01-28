/*
Ask the user for input
Save input as string
Save as file
*/

#include <iostream>
#include <fstream>
using namespace std;

bool checkInput(string& input){
    return input.empty();
}


int main(){

    ofstream file("test.txt");
    //file.open("test.txt");
    string text = "";
    cout << "Please introduce whatever you want to save as a file." << endl;
    cin >> text;

    if(checkInput(text) != true){
        file << text;
    } else {
        file << "Oh No! The input was empty D:";
        cout << "There was an error writing the input...";
    }

    file.close();

return 0;
}