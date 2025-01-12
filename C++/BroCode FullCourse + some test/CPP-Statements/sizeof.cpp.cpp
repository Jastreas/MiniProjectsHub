#include <iostream>

int main(){

    //sizeof() determines the size in bits of vars, data types, class, objects, etc...

    double gpa = 2.5; //cout sizeof(gpa) --> 8 (bytes)
    //the size of strings is 32 bytes

    //useful example

    char grades[] = {'A', 'B', 'C', 'D', 'F'};
    std::cout << sizeof(grades)/sizeof(char) << "elements\n"; //prints: "5 elements"

    return 0;
}