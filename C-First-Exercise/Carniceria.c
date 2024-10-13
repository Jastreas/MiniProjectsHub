#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>

int main() {

    int fp;
    char saludo[] = "Carniceria\n";
    fp = open("FIFO", O_WRONLY | O_NONBLOCK);

    if (fp == -1) {
        perror("Error al abrir el FIFO");
        exit(EXIT_FAILURE);
    }


    printf("Mandando información al FIFO...\n");

    write(fp, saludo, strlen(saludo));

    close(fp);

    return 0;

}
