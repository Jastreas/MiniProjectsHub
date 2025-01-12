#include <iostream>

int main(){

    //memory adress = a location in memory where data is stored
    //a memory adress can be accessed with &
    int n = 32;

    std::cout << &n << '\n';

    return 0;
}

//passing by value you create a clone of the variable
//passing by reference uses the variable passed since you are inputing the memory location --> this is what should usually 
//be done unless a specific reason