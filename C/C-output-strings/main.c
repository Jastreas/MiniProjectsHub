#include <stdio.h>

int main() {
	
	char usrInput[20];
	
	printf("introduce a text (10 characters as max): \n");
	fgets(usrInput, sizeof(usrInput), stdin);
	
	printf("your introduced text is: \n %s", usrInput);
	
	return 0;
}