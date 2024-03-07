#include <stdio.h>
#include <stdlib.h>

// malloc -> memory allocation
// calloc -> contiguous allocation
// realloc -> reallocation of memory
// free -> free of memory

int main()
{
	// 1
	int i;
	int count;
	int *ptr; // ptr holds the address of another integer type variable
	int sum = 0;

	// 2
	printf("Enter the total number of elements you want to enter : ");
	scanf("%d", &count);

	// 3
	ptr = (int *)malloc(count * sizeof(int)); // each int holds 4 bytes, count=5, then we can store 5 integers or 20 bytes // ptr holds the starting address of the dynamically allocated memory block of 20 bytes

	// 4
	for (i = 0; i < count; i++)
	{
		// 5
		printf("Enter element %d : ", (i + 1));
		scanf("%d", ptr + i); // 3000 +0 // 3000 + 1*4 // 3000 + 2*4

		// 6
		sum += *(ptr + i); // dereferencing the ptr to get the value and store in sum
	}

	// 7
	printf("sum is %d \n", sum);

	// 8
	free(ptr); //free the dynamically allocated memory after use
	return 0;
}