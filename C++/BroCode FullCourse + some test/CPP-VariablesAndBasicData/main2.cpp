#include <iostream>

int main(){

    //int (whole number)
    int age = 21;
    int year = 2025;
    int days = 7.5; //as in c, the decimal portion is truncated

    //double
    double price = 10.99;
    double gpa = 2.5;
    double temperature = 25.1;

    //char single character
    char grade = 'A';
    char initial = 'BC'; //will trigger an overfloat warning and print just the last char
    char currency = '$';

    //boolean (t/f)
    bool student = true;
    bool power = false;
    bool forSale = true;

    //Strings (object that represent an array of chars)
    std::string name = "Astreas";
    std::string day = "Sunday";
    std::string food = "Pizza";
    std::string address = "123 fake St.";

    //Printing
    std::cout << "Hello " << name << '\n';
    std::cout << "You are " << age << " years old";

    return 0;
}