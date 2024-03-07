#include <stdio.h>

float areaFunc(int r){
    float area = 0.0;
    area = 3.14 * r * r;
    return area;
}

int main(){
    int r;
    printf("Enter radius: ");
    scanf("%d",&r);
    float a = areaFunc(r);
    printf("Area: %f", a);
}