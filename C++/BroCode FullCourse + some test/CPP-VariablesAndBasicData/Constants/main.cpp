#include <iostream>

int main(){
    
    const double PI = 3.14159;
    double radius = 10;
    double circumference = 2 * PI * radius;

    std::cout << circumference << "cm";

    return 0;
}

//example: frames per second lock: const int fps = 60;