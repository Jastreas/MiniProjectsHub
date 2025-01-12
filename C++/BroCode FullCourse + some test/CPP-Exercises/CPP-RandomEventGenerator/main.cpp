#include <iostream>
#include <ctime>


int main(){
    srand(time(0));

    switch ((rand() % 4)){
        case 1:
            std::cout << "You recieve 100 zenis\n";
            break;
        case 2:
            std::cout << "You recieve price card\n";
            break;
        case 3:
            std::cout << "You recieve ammo\n";
            break;
        case 4:
            std::cout << "TRAP CHEST! 4 monsters will be generated\n";
            break;
        default:
            std::cout << "Empty\n"; 

    }


    return 0;
}