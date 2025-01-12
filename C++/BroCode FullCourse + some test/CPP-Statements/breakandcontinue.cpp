#include <iostream>

int main(){
/* 
    THIS WILL STOP THE LOOP WHEN I = 13

    for(int i = 1; i <= 20; i++){
        if(i == 13){
            break;
        }
        std::cout << i << '\n';
    }
*/
// THIS WILL JUST SKIP THE 13TH ITERATION

    for(int i = 1; i <= 20; i++){
        if(i == 13){
            continue;
        }
        std::cout << i << '\n';
    }

    return 0;
}