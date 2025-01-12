#include <iostream>
#include <vector>

//typedef std::string hawktuah_t; //this is kind of outdated
typedef int number_t; //so its not really recommended

using text_t =  std::string; //this is more like it (more used becouse of templates)

int main(){

    text_t text = "Bro";
    number_t age = 10;

    std::cout << text << '\t' << age << std::endl;
    
    return 0;
}