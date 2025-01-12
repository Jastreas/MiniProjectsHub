#include <iostream>

int main(){

    //Implicit = automatic
    //Explicit = Precede value with new data type

    double x = (int) 3.14; //this will explicitly transform 3.14 to integer and then implicitly transform the result to double
    //and then storing the result in the x var

    //Other examples

    char x = 100; //convert 100 to its ascii value
    std::cout << (char)100;

    std::cout << x;

    return 0;
}