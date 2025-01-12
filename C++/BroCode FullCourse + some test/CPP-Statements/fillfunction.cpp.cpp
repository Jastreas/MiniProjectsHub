#include <iostream>

int main(){

    std::string foods[150];

    fill(foods, foods + 100, "pizza"); //index 0-99 will be pizza
    fill(foods, foods + 101, "hamburger"); //indx 100-149 will be hamburger

    return 0;
}