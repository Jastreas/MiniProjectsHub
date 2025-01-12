#include <iostream>
#include <ctime> //needed header

int main(){

    //pseudo-random = NOT truly random (but close)

    srand(time(NULL)); //passing the current time as seed (normal practice)
    int num = (rand() % 20) + 1; //storing the first generated number in a var

    std::cout << num;

    return 0;
}