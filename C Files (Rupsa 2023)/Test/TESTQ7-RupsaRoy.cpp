#include <stdio.h>
#include <math.h>
int main()
{
	int x,c;
	int i,num,m,fac;
	printf("Input the value of x :");
	scanf("%d",&x);
	printf("Input number of terms : ");
	scanf("%d",&num); // num=2
	float sum,n;
	sum =1; 
	m=-1;

    for (i = 1; i < num; i++) 
    {
        c = (2 * i);

        fac=1;
        for (int j=1;j<=c;j++)
        {
        	fac=fac*j;
		}
		printf("Fac: %d\n",fac);
		n = ((pow(x, c)) * m)/fac;
        printf("n: %f\n",n);
        sum = sum + n;
        printf("Sum: %f\n",sum);
        m = m * (-1);
		
	}
	printf("\nThe sum = %f\n",sum);
}

