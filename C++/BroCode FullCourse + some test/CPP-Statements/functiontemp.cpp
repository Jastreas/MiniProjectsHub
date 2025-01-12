#include <iostream>
template <typename T, typename U>

auto max(T n1, U n2){
    return n1 > n2 ? n1 : n2;
}



int main(){
    std::cout << max(20, 1.2) << '\n';
    return 0;
}