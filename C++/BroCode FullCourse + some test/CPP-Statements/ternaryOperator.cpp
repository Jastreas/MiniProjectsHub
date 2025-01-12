#include <iostream>

int main(){

    //replacement to an if/else
    //condition ? expression1 : expression2;

    int grade = 75;

    /*
        if(grade >= 60){
            std::cout << "You pass!";
        } else {
            std::cout << "You fail!";
        }
    */

    grade >= 60 ? std::cout << "You pass!" : std::cout << "You fail!";

    std::cout << "\n";

    //Another example
    int number = 9;
    number %2 == 0? std::cout << "Even" : std::cout << "Odd"; //actually no need of == since 1 = false and 0 = true

    //its usable in a print
    std::cout << "\n";
    
    bool hungry = true;
    std::cout << (hungry ? "You are hungry!" : "You are full");


    return 0;
}