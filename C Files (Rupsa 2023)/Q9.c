#include <stdio.h>

int main(){
    int count = 1;
    for(int i=4;i>=0;i--){
        for(int j=i;j >= 0; j--){
            printf(" ");
        }
        for(int k = 1; k <= count; k++){
            printf("*");
        }
        count += 2;
        printf("\n");
    }
}