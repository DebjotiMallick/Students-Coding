#include <stdio.h>

double areaf(double r)
{
	double area=3.14*r*r;
	return area;
}

double circumf(double r)
{
   double circum= 2*3.14*r;
   return circum;	
}

int main()
{
	double rad,a,c;
	printf("enter the radius");
	scanf("%lf",&rad);
	a=areaf(rad);
	c=circumf(rad);
	printf("%lf\n",a);
	printf("%lf",c);
}