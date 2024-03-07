#include <stdio.h>
#include <math.h>

int numtobin(int n)
{
	int i=0,a,bnum=0;
	while(n>0)
	{
		a=n%2;
		bnum=bnum+a*pow(10,i);
	    n=n/2;
	    i++;
	}
return (bnum);
}
int main()
   {
	int n,a,num;
	printf("enter a number ");
	scanf("%d",&n);
	
	
	num=numtobin(n);
	printf("the binary number is ");
	printf("%d",num);
	
}