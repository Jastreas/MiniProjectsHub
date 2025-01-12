// Car.cpp
#include "Car.h"

// Constructor implementation
Car::Car(std::string& color) {
    this->color = color;
}

// Getter for color
std::string Car::getColor() {
    return color;
}

//Setter for color
std::string Car::setColor(std::string& color) {
    this->color = color;
}