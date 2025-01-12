//its kind of the same as always

#include <iostream>

int main(){

    std::string arr[1]; //arrays are static so you need to initialize a size (as in java)
    std::string car[] = {"Corvette", "Mustang", "Porsche"}; //as in java the arrays are monotype

    //cout car --> will display the memory address of where the array is located
    //cout car[0] --> outputs Corvette

    car[0] = "Camaro";

    //cout car[0] --> Camaro

    arr[0] = "car1";

    return 0;
}

//for iterations with arrays is like in java with for i loops and nested for loops for bidimensional arrays

//Arrays can be passed through parameter to functions or procedures (methods) without needing the []
//but you never work with the array in a function
//you work with a pointer to the array

//multidimenisonal arrays are the same as in java