#include <iostream>

int main(){

    //pointers = variables that stores a memory adress of another var
    //& address-of operator
    //* dereference operator

    std::string name = "Dude";
    std::string *pName = &name;

    //cout pName will show the hexadecimal code of the location in memory
    //cout *pName will show the actual value stored there 

    double grade = 9.8;
    double *pGrade = &grade;

    std::cout << *pGrade << '\n';


    //THIS IS KIND OF VERY IMPORTANT
    //pointers not initialized right away should be initialiced to null
    int *pointer = nullptr;
    int x = 123;
    pointer = &x;

    //after this people usually 
    if (pointer == nullptr){
        std::cout << "pointer not assigned correctly\n";
    } else {
        std::cout << "pointer assigned correctly\n";
    }

    //FOR DYNAMIC MEMORY (new)
    int *pNum = nullptr;
    pNum = new int;

    *pNum = 21;

    //using the pointer

    //after using pointer

    delete pNum; //do this to free the memory when the pointer is not needed more (can cause memory leaks)

    return 0;
}