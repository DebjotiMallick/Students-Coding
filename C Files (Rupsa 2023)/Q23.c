#include <stdio.h>

void reverse_range(int* buffer, int left, int right){
    while (left < right){
        int temp = buffer[left];
        buffer[left++] = buffer[right];
        buffer[right--] = temp;
    }
}

int main(){
    int a[3] = {1, 2, 3};
    reverse_range(a, 0, 2);
    for (int i = 0; i < 3; i++) {
        printf("%d ", a[i]);
    }
}