#include <stdio.h>

int main(){
    int matrix1[3][3], matrix2[3][3]; // we take a 2D array with 3x3 elements
    printf("Enter elements of matrix1:\n");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            scanf("%d", &matrix1[i][j]);
        }
    }

    printf("Enter elements of matrix1:\n");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            scanf("%d", &matrix2[i][j]);
        }
    }

    printf("Sum of the two matrices:\n");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            printf("%d ", matrix1[i][j]+matrix2[i][j]);
        }
        printf("\n");
    }


}