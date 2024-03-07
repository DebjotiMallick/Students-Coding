#include<stdio.h>
int main()
{
	int a1[4],i,sum=0,c=0;
	printf("enter the numbers -");
	for (i=0;i<=3;i++)
	{
		scanf("%d",&a1[i]);
	}
	
	for (i=0;i<4;i++)
	{
		c=0;
        int j;
		for (j=0;j<5;j++)
		{
			if(i!=j)
			{
			
			  if (a1[i]==a1[j])
			  c++;
		    }
		}
        if (c==0)
	    {
		    printf("%d",a1[i]);
	    }
	}
	
}