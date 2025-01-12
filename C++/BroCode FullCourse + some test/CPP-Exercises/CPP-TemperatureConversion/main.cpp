//INCOMPLETE

#include <iostream>

int main(){

    using std::cout;
    using std::cin;

    double temp;
    char unit;

    cout << "****** Temperature Conversion ******\n";
    cout << "Introduce what do you want to convert to: \n";
    cout << "(F) -> Farenhait\n";
    cout << "(C) -> Celsius\n";
    cin >> unit;

    switch(unit){
        case 'C':
            cout << "Introduce the temperature (Farenhait): \n";
            cin >> temp;
            temp = (temp - 32) / 1.8;
            cout << "The temperature in celsius is: " << temp << '\n';
            break;
        case 'F':
            cout << "Introduce the temperature (Celsius): \n";
            cin >> temp;
            temp = temp * 1.8 + 32;
            cout << "The temperature in celsius is: " << temp << '\n';
            break;
        default:
            cout << "You didn't introduce a correct value to convert, please restart the program...\n";
    }

    //had to do it with if else statement to || lowercase letters

    cout << "\n*********************************";

    return 0;
}