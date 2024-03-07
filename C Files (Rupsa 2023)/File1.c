#include<stdio.h>
#include<stdlib.h>


int main()
{
	char str[20];
	FILE *fptr;
	char fname[20]="file123.txt";
	
	fptr=fopen(fname,"w");
	if (fptr==NULL)
	{
		printf("error");
		exit(1);
	}
    printf("Enter some string to store in file: ");
    gets(str);
	fprintf(fptr,"%s",str);
	fclose(fptr);
	printf("the file is created  ",fname);
	return 0;
}