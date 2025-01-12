#include <iostream>

int main(){

    //do while loop = do some block of code first, THEN repeat if condition matches

    int number;

    do{
        std::cout << "Introduce a positive number: \n";
        std::cin >> number;
    } while(number < 0);

    std::cout << "The number is: " << number;

    return 0;
}