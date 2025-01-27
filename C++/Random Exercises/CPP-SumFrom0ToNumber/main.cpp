/* Ask the user to introduce a whole number and print the sumatory of all the 
numbers from 0 to the number */


#include <iostream>

using namespace std;

int main(){

int n = 0;
int res = 0;

cout << "****************SUMCALC****************" << std::endl;
cout << "Introduce a whole number: " << std::endl;
cin >> n;

if(n < 0){
    cout << "Incorrect number type";
} else {
    for(int i = 0; i <= n; i++){
       res += i; 
    }
    cout << "The result of the sumatory from 0 to " << n << " is: " << res << endl;
}

return 0;
}