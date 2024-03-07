#include <stdio.h>
#include <string.h>

int main(){
    // char ch = 'c';
    // char str[100] = "hello world"; // string in C is basically an array of characters

    // printf("Character: %c\n", ch);
    // printf("String: %s\n", str);

    // char str2[100] = "";
    // strcpy(str2, str);
    // int len = strlen(str2);
    // printf("String2 length: %d", len);

    // char ch;
    // printf("Enter the character you want to: ");
    // scanf("%c", &ch);
    // printf("The character is %c\n", ch);

    char str[100];
    printf("Enter the string you want to: ");
    gets(str);
    printf("The string is %s\n", str);
    printf("The string is ");
    puts(str);
}