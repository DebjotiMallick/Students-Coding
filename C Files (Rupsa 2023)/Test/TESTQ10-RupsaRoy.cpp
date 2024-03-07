#include <stdio.h>

void swapnum(int *x,int *y,int *z) // these are pointers, which accept memory addresses
{
    int tmp;
    tmp=*y; // x currently holds the address of n1, which we dereference using *x
    *y=*x;
    *x=*z;
    *z=tmp;
}


int main()
{
    int n1,n2,n3;
    printf(" Input the value of 1st element : ");
    scanf("%d",&n1);
    printf(" Input the value of 2nd element : ");
    scanf("%d",&n2);
    printf(" Input the value of 3rd element : ");
    scanf("%d",&n3);


    swapnum(&n1,&n2,&n3); // we pass addresses of n1,n2,n3 to the function which accepts pointers, so types are matching
    printf("\n The value after swapping are :\n");
    printf(" element 1 = %d\n element 2 = %d\n element 3 = %d",n1,n2,n3);
    return 0;
}

