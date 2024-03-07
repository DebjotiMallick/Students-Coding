#include <stdio.h>

int main(){
    int a,b,temp,*i,*j;
    printf("Enter two integer: ");
    scanf("%d %d",&a,&b);
    i=&a;
    j=&b;
    temp=*i;
    a=*j;
    b=temp;
    printf("After swap: %d %d",a,b);
    return 0;
}
