// main.cpp
#include <iostream>
#include "Car.h"

int main() {

    std::string color1 = "Red";
    std::string color2 = "Blue";

    // Create a Car object
    Car myCar(color1);
    Car myCar2 (color2);

    // Print the color of the car
    std::cout << "The car color is: " << myCar.getColor() << std::endl;
    std::cout << "The car color is: " << myCar2.getColor() << std::endl;


    myCar.setColor(color2);

    color2 = "yellow";

    myCar2.setColor(color2);

    std::cout << "The car color is: " << myCar.getColor() << std::endl;
    std::cout << "The car color is: " << myCar2.getColor() << std::endl;
    return 0;
}
