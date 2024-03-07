#include<stdio.h>

int sumdigit(int n)
{
	int sum;
	if(n>0)
	{
		
		int sum=(n%10)+sumdigit(n/10);
	}
	return sum;
}

int main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	
	printf("%d",sumdigit(n));
	return 0;
}