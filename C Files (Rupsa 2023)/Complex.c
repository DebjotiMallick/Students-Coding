#include <stdio.h>
struct complex
{
    float real;
    float imag;
};

struct complex add(struct complex n1, struct complex n2) 
{
    struct complex temp;
    temp.real = n1.real + n2.real;
    temp.imag = n1.imag + n2.imag;
    return (temp);
}
struct complex sub(struct complex n1, struct complex n2) 
{
    struct complex temp2;
    temp2.real = n1.real - n2.real;
    temp2.imag = n1.imag - n2.imag;
    return (temp2);
}
struct complex mul(struct complex n1, struct complex n2) 
{
    struct complex temp1;
    temp1.real = ((n1.real * n2.real)-(n1.imag * n2.imag));
    temp1.imag = ((n1.real* n2.imag)+ (n1.imag* n2.real));
    return (temp1);
}

int main() 
{
    struct complex n1, n2, resultadd, resultsub, resultmul;

    printf("For 1st complex number \n");
    printf("Enter the real and imaginary parts: ");
    scanf("%f %f", &n1.real, &n1.imag);
    printf("\nFor 2nd complex number \n");
    printf("Enter the real and imaginary parts: ");
    scanf("%f %f", &n2.real, &n2.imag);

    resultadd = add(n1, n2);
    resultsub = sub(n1,n2);
    resultmul = mul(n1,n2);

    printf("Sum = %.2f + %.2fi\n", resultadd.real, resultadd.imag);
    printf("difference = %.2f + %.2fi\n", resultsub.real, resultsub.imag);
    printf("product = %.2f + %.2fi\n", resultmul.real, resultmul.imag);
    return 0;
}