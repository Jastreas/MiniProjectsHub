#include <iostream>

int main(){

    int age;

    std::cout << "Introduce your age: ";
    std::cin >> age;
    
    if(age >= 18){
        std::cout << "Welcome to the site!";
    } else if (age < 0){
        std::cout << "You haven't been born yet!";
    } else if (age >= 100){ //this won't work since the first if statement is true the block code will not be ignored
        std::cout << "You are too old to enter the site!"; 
    }
     else {
        std::cout << "You are not old enough to enter!";
    }

    return 0;
}

//kind of the same as java tbh but the order does matter (I don't remember if in java works the same way)