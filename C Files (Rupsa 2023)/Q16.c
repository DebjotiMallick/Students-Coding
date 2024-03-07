#include <stdio.h>
#include <string.h>

void concatWithout(){
    char str1[100], str2[100];
    int endIndex = 0;
    printf("Enter the first string: ");
    scanf("%s", str1);
    printf("Enter the second string: ");
    scanf("%s", str2);

    for(int i = 0; str1[i] != '\0'; i++){
        endIndex++; // this to identify the last index of first string
    }

    for(int j = 0; str2[j] != '\0'; j++, endIndex++){
        str1[endIndex] = str2[j]; // we store second string char by char into the first string after endIndex
    }
    str1[endIndex] = '\0'; // finish the original string with a null character to define the end of string

    puts(str1);
}

void concatWith(){
    char str1[100], str2[100];
    printf("Enter the first string: ");
    scanf("%s", str1);
    printf("Enter the second string: ");
    scanf("%s", str2);

    strcat(str1, str2); // final output is stored in the first string variable
    puts(str1);
}

void compareWith(){
    char str1[100], str2[100];
    printf("Enter the first string: ");
    scanf("%s", str1);
    printf("Enter the second string: ");
    scanf("%s", str2);

    printf("%d", strcmp(str1, str2)); // 0 for equal, -1 when first string is lexicographically comes before second string, else 1
}

int main(){
    int option;

    printf("Enter the option: ");
    scanf("%d", &option);
    switch(option){
        case 1:
        case 2: concatWithout();
        case 3: concatWith();
        case 4: compareWith();
    }
}