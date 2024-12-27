#include <stdio.h>

int main(){
	int x; //declaration
	x = 0; //initialization
	
	int y = 123; //usual stuff
	
	int age = 20; //integer
	float hdi = 97.29; //floating point number
	char grade = 'S'; //character
	
	char name[] = "Bro"; //strings (it actually doesn't exist)
	
	//there's a huge amount of variables, but this basic ones are good enough by now
	
	printf("Hello %s\n", name);
	printf("you are %d years old\n", age);
	printf("your average grade is %c\n", grade);
	printf("The average hdi of your country is %f", hdi);
	
	return 0;
}