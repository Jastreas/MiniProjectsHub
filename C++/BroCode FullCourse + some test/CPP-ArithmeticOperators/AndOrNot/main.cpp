#include <iostream>

int main(){

    int temp;
    bool sunny = true;
    std::cout << "Enter the temperature: ";
    std::cin >> temp;

    if(temp > 0 && temp < 30){
        std::cout << "The temp is good\n";
    } else {
        std::cout << "The temp is bad\n";
    }
/*
    if(temp >= 0 || temp <= 30){
        std::cout << "The temp is good";
    } else {
        std::cout << "The temp is bad";
    }
*/
    if(!sunny){
        std::cout << "It is cloudy outside";
    } else {
        std::cout << "It is sunny outside";
    }

    return 0;
}