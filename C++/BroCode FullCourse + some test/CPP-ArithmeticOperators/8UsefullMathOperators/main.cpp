//8 Usefull operators

#include <iostream>
#include <cmath>

int main(){

    double x = 3.14;
    double y = 4;
    double z;

    z = std::max(x, y); //returns the max value between the parameters
    z = std::min(x, y); //returns the min value between the parameters

    //this functions are included in the cmath header
    z = pow(2, 4); //power of n1 to n2
    z = sqrt(9); //square root of parameter
    z = abs(-3); //absolute value of par
    z = round(x); //round par
    z = ceil(x); //round to the high of par
    z = floor(x); //round to the low of par

    //cmath inlcudes a lot more of functions, worth checking when working with math

    return 0;
}