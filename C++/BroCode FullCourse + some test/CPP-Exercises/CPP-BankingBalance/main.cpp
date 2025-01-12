#include <iostream>
#include <iomanip> //habilitates manipulation of data for example limiting floating vars to 2 decimals

using std::cout;
using std::cin;

void showBalance(double balance);
double deposit();
double withdraw(double balance);




int main(){

    double balance = 0;
    int choice = 0;

    do {
        cout << "*******************\n";
        cout << "Enter you choice\n";
        cout << "1.Show Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit\n";
        cout << "*******************\n";
        cin >> choice;

        /*
        When you use std::cin to take input, it tries to match the input with the expected type. 
        If the input doesn't match the expected type (like entering a letter when a number is expected), cin will:
        - Set an error flag in the input stream, preventing further input operations from working.
        - Leave the invalid input in the input buffer, causing future input to fail as well.
        Without handling this correctly, your program can get stuck or behave unexpectedly.
        */
        cin.clear(); //this function resets error flags when stdcin miss to interpret input
        fflush(stdin); //this clears the input buffer

        switch(choice){
            case 1:
                showBalance(balance);
                break;
            case 2:
                balance += deposit();
                break;
            case 3:
                balance -= withdraw(balance);
                break;
            case 4:
                cout << "Thanks for using!\n";
                break;
            default:
                cout << "Invalid option\n";
                }
    }while(choice != 4);

    return 0;
}

void showBalance(double balance){
    cout << "Your balance is: " << std::setprecision(2) << std::fixed << balance << " $\n";
}
double deposit(){
    double amount = 0;
    cout << "Enter how much you want to deposit\n";
    cin >> amount;

    if(amount < 0){
        cout << "YOU INTRODUCED AN INVALID AMOUNT\n";
        amount = 0;
    }
    return amount;
}
double withdraw(double balance){

    double amount = 0;
    cout << "Enter amount to be withdrawn\n";
    cin >> amount;

    if(amount > balance){
        cout << "NOT ENOUGH FOUNDS\n";
        amount = 0;
    } else if (amount < 0){
        cout << "YOU INTRODUCED AN INVALID AMOUNT\n";
        amount = 0;
    }

    return amount;
}