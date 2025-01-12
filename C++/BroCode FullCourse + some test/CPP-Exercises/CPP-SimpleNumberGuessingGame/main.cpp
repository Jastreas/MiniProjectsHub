#include <iostream>
#include <ctime>

int main(){

    srand(time(0));

    int numberToGuess = (rand() % 10) + 1, userNum = 0, tries = 0;
    bool win = false;

    do {
        std::cout << "What number did I create?" << '\n';
        std::cin >> userNum;
        tries++;

        if(userNum == numberToGuess){
            std::cout << "You won in: " << tries << " tries";
            win = true;
        } else if (userNum > numberToGuess){
            std::cout << "Try something lower\n";
        } else if (userNum < numberToGuess){
            std::cout << "Try something higher\n";
        } else {
            std::cout << "Please introduce a valid number\n";
        }
        
    } while(!win);

    return 0;
}