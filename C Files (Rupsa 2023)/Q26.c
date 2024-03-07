// C program to demonstrate
// addition of complex numbers
#include <stdio.h>

// define a structure for complex number
struct complex{
	int real;
	int img;
} a, b, sum;

// Driver code
int main()
{
	// First complex number
	a.real = 2;
	a.img = 3;

	// Second complex number
	b.real = 4;
	b.img = 5;

	// Print first complex number
	printf("\n a = %d + %di", a.real, a.img);

	// print second complex number
	printf("\n b = %d + %di", b.real, b.img);

	sum.real = a.real + b.real;
    sum.img = a.img + b.img;

	// Print result
	printf("\n sum = %d + %di", sum.real, sum.img);

	return 0;
}