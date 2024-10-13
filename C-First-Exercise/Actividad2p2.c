//crea 
#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>

int main(void){
	int fp;
	int p, bytesleidos;
	char saludo[] = "Un saludo\n", buffer[10];

	p = mkfifo("FIFO", S_IFIFO|0666);

	if (p == -1){
	    perror("Error al leer el archivo temporal FIFO");
        exit(EXIT_FAILURE);
	}

	while(1){
		fp = open("FIFO", 0);
		bytesleidos = read(fp, buffer, 1);
		printf("Obteniendo Información...\n");
    while (bytesleidos != 0){
        printf("%1c", buffer[0]);
		bytesleidos = read(fp, buffer, 1);
		}
    
    if (bytesleidos == -1) {
        perror("Error al leer del archivo FIFO");
        close(fp);
        exit(EXIT_FAILURE);
        }
	close(fp);
	}
return(0);
}
