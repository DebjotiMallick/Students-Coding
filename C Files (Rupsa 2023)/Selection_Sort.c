#include <stdio.h>
int main()
{
    int n = 10;
    int a[] = {3,2,6,5,4,7,8,9,5,1};
    int min_index;
    for(int i = 0; i < n - 1; i++) {
        min_index = i; //at starting, minimum number is at i index
        for(int j = i + 1; j < n; j++) {
            if(a[min_index] > a[j]) { // if any number is less than the number at min index
                min_index = j; // update the min index to that index, which is j
            }
        }
        if(min_index != i) //min_index has been changed to j
        {
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
    }
    printf("Sorted Array: ");
    for(int i = 0; i < n; i++)  {
        printf(" %d", a[i]);
    }
    return 0;
}
