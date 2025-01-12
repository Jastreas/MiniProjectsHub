// Car.h
#ifndef CAR_H
#define CAR_H

#include <string>

class Car {
private:
    std::string color;

public:
    // Constructor
    Car(std::string& color);

    // Getter for color
    std::string getColor();

    // Setter for color
    std::string setColor(std::string& color);
};

#endif