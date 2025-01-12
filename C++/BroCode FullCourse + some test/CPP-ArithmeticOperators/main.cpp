#include <iostream>

int main(){


    /* Hierarchy:
    parenthesis
    multiplication and division from left to right
    addition and substraction same order

    (basically, mathematics)
    */

    int students = 20;

    //SUM
    students += 1;
    //or
    students++;

    //MIN
    students -= 1;
    //or
    students--;

    //MULT
    students *= 2;

    //DIV
    students /= 2;

    //MOD
    students %= 2;

    //remember that the variable type matters
    
    std::cout << students << std::endl;

    return 0;
}