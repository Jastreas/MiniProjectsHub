#include <iostream>

//cout << (insertion operator)
//cin >> (extraction operator)

int main(){

    std::string name;
    int age;

    std::cout << "Please introduce your age" << '\n';
    std::cin >> age;

    //if we accept ui with getline after a cin in our input buffer there's a \n char that we didnt accepted in the cin
    //when it enters in the getline (cuz its buffered) its like pressing enter, to solve it just add >> std:ws after std::cin
    //in the getline method, this will get rid of all the white spaces and new lines before the ui

    std::cout << "Whats your full name?" << '\n';
    //std::cin >> name; this can be overfloated
    //for solventing this:
    std::getline(std::cin >> std::ws, name);

    std::cout << "Hello " << name << ", you are " << age << " years old." << std::endl;

    return 0;
}