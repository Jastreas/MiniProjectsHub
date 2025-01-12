#include <iostream>

namespace first{
    int x = 1;
}

namespace second{
    int x = 2;
}

int main(){
    //using namespace first; if i do this, then the implicit x will be first.

    //for quick coding you can use using std--> Not really recommended.

    using std::string; //this doesnt need the spacename tag since its spacename std and name ::string

    //this will allow me to:
    string s = "Hello";

    //example
    using std::cout;
    cout << s;

    int x = 0;

    cout << x;
    cout << first::x;
    cout << second::x;

    return 0;
}