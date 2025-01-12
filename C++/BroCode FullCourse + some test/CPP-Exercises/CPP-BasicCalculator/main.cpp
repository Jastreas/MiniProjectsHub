#include <iostream>

int main(){

    double n1, n2, res;
    char option;
    std::cout << "*************** CALCULATOR ***************\n";
    std::cout << "Please introduce #1: " << '\n';
    std::cin >> n1;
    std::cout << "Please introduce #2: " << '\n';
    std::cin >> n2;
    std::cout << "Please introduce the operator for the operation you want to execute: (+) (-) (*) (/)" << '\n';
    std::cin >> option;

    switch(option){
        case '+':
            res = n1 + n2;
            break;
        case '-':
            res = n1 - n2;
            break;
        case '*':
            res = n1 * n2;
            break;
        case '/':
            res = n1 / n2;
            break;
        default:
            std::cout << "You didn't introduce a valid operator, please restart the program.";
    }

    std::cout << res << std::endl; 
    std::cout << "******************************************";

    return 0;
}