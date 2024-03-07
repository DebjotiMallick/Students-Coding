#include <stdio.h>

// factorial of 5
// 5 * factorial of 4
// 5 * 4 * factorial of 3

int factorial(int n)
{
	if (n == 0)
		return 1;
	return n * factorial(n - 1);
}

// return 5 * factorial(4)
// return 5 * 4 * factorial(3)
// return 5 * 4 * 3 * factorial(2)

int main()
{
	int num = 5;
	printf("Factorial of %d is %d",
		num, factorial(num));
	return 0;
}
