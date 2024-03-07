#include <stdio.h>
#include <stdlib.h> // For exit()
  
int main()
{
    FILE *fptr1 = fopen("file1.txt", "r");
    FILE *fptr2 = fopen("file2.txt", "w");
    char c;
  
    // Read contents from file
    c = fgetc(fptr1);
    while (c != EOF)
    {
        if(c != '\n' && c != ' ' && c!='\t')
            fputc(c, fptr2);
        c = fgetc(fptr1);
    }
  
    printf("\nContents copied");
  
    fclose(fptr1);
    fclose(fptr2);
    return 0;
}