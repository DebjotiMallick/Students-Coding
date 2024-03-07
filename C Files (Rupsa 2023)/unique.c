#include <stdio.h>

int main(){
    int n,count;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int num[n];
    printf("Enter the elements: ");
    for(int i=0; i<n; i++){
        scanf("%d",&num[i]);
    }

    // 1 3 3 4 4 7 6

    for(int i=0; i<n; i++){
        count = 0;
        for(int j=0; j<n+1; j++){
            if(i != j){                // dont check with the same element
                if(num[i] == num[j]){
                count++;
                }
            }
        }
        if(count == 0){
            printf("%d  ", num[i]);
        }
    }
}