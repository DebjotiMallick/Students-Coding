#include <stdio.h>

int main(){
    int num[5];
    printf("Enter the numbers of array: \n");
    for(int i=0; i < 5; i++){
        scanf("%d", &num[i]);
    }

    printf("The list of numbers are:\n");
    for(int i=0; i < 5; i++){
        printf("%d\n", num[i]);
    }
}