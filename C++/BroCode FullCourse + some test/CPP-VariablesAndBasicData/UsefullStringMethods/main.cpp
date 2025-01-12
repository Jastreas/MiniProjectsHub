#include <iostream>

int main(){

    std::string name;

    std::cout << "Enter your name: ";
    std::getline(std::cin, name);

    int len = name.length(); //returns length of string
    bool empt = name.empty(); // empty ? true : false
    name.clear(); //clears the string var aka now empty = true
    name.append("@gmail.com"); //appends the parameter
    char c = name.at(0); //returns the character at that position of the str array
    name.insert(0, "@educa."); //inserts in the position of the array the parameter
    char c2 = name.find(' '); //returns the position the character appeared for the first time
    c2 = name.rfind(' '); //returns the position the character appeared for the last time
    name.erase(0, 3); //erases the characters between p1 and p2 (not inclusive aka pos 1,2,3)

    return 0;
}