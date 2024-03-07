#include <stdio.h>

void evenValued(int arr[], int n){
    printf("The even elements are: ");
    for(int i = 0; i < n; i++){
        if(arr[i] % 2 == 0){
            printf("%d ", arr[i]);
        }
    }
}

void oddValued(){
    
}

void sumAndAverage(){

}

void maxAndMin(){

}

void removeDuplicates(int arr[], int n){
    int i,j,k; //global scoping of variables
    for( i = 0; i < n-1; i++){
        for( j = i+1; j < n; j++){
            if(arr[i] == arr[j]){
                for( k = j; k < n; k++){
                    arr[k] = arr[k+1];
                }
                j--;
                n--;
            }
        }
    }

    for( i = 0; i < n; i++){
        printf("%d", arr[i]);
    }

    printf("\n");
    
}

void reverseArray(){

}

int main(){
    while(1){
        int n;
        printf("How many elements you want to store in the array?: ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter the elements: ");
        for(int i = 0; i < n; i++){
            scanf("%d", &arr[i]);
        }

        int option;
        printf("List of options:\n 1. Print the even-valued elements \n 2. Print the odd-valued elements \n 3. Calculate and print the sum and average of the elements of array \n 4. Print the maximum and minimum element of array \n 5. Remove the duplicates from the array \n 6. Print the array in reverse order.");
        printf("\nEnter an option from the above list: ");
        scanf("%d", &option);

        switch (option){
            case 1: evenValued(arr, n);
            break;
            case 2: oddValued();
            break;
            case 3: sumAndAverage();
            break;
            case 4: maxAndMin();
            break;
            case 5: removeDuplicates(arr, n);
            break;
            case 6: reverseArray();
        }

        int cont;
        printf("Do you want to continue? Enter 1 for yes, 0 for no: ");
        scanf("%d", &cont);

        if(cont == 1){
            continue;
        } else {
            break;
        }
    }


}