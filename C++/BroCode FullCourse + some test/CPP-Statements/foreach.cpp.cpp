#include <iostream>

int main(){

    //for-each = loop that eases the transversal of an iterable data set

    std::string students[] = {"spongeboy", "the notorious P.A.T", "squidwock"};

    //normal iteration:
    /*
    for(int i = 0; i < sizeof(students)/sizeof(students[0]); i++){
        std::cout << students[i] << '\n';
    }
    */

   for(std::string student : students){
    std::cout << student << '\n';
   }

   //other example
   int grades[] = {64, 78, 98};

   for(int grade : grades){ //for each grade in grades do:
    std::cout << grade << '\n'; //this
   }
    return 0;
}