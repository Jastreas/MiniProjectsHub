#include <iostream>
#include <cmath>

int main(){

    double l1, l2, h;
    
    std::cout << "Please introduce the value for l1: " << '\n';
    std::cin >> l1;
    std::cout << "Please introduce the value for l2: " << '\n';
    std::cin >> l2;
    //Pythagorean theorem
    h = sqrt(pow(l1, 2) + pow(l2, 2));

    std::cout << h << std::endl;

    return 0;
}