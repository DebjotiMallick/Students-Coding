#include <stdio.h>

int  ArrElmt(int arr1[], int in, int m) // arr1, 0, 5
{
    if(in < m)
    {
    	printf("%d  ", arr1[in]);
    }
    ArrElmt (arr1, in+1, m);
}


int main()
{
    int arr1[50];
    int n, i;
	
	printf(" Input the number of elements to be stored in the array :");
    scanf("%d",&n);
   
    printf(" Input %d elements in the array : ",n);
    for(i=0;i<n;i++)
        {
	      scanf("%d",&arr1[i]);
	    }
     
    printf(" The elements in the array are : ");
    ArrElmt(arr1, 0, n);
     
    return 0;
}

