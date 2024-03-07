#include <stdio.h>
#include <string.h>

int main(){
    char *str = "The quick brown fox jumped over the lazy dog.";

    int counts[256] = { 0 };

    int i;
    int len = strlen(str);

    for (i = 0; i < len; i++) {
        counts[(int)(str[i])]++;
    }

    for (i = 0; i < 256; i++) {
        if (counts[i] != 0) {
            printf("The %c. character has %d occurrences.\n", i, counts[i]);
        }
    }
}