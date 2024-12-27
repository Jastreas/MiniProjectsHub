#include <stdio.h>

int main(){
	
	//usr vars
	int num;
	char character;

	//input
	printf("Type a number and a char: \n");
	scanf("%d %c", &num, &character);

	//prints
	printf("Your number is: %d\n", num);
	printf("Your character is: %c\n", character);
	
	return 0;
}