#include <stdio.h>

int fibbonacci(int n) {
   if(n == 0){
      return 0;
   } else if(n == 1) {
      return 1;
   } else {
      return (fibbonacci(n-1) + fibbonacci(n-2));
   }
}

// 0
// 0 1
// 0 1 (0+1) 
// 0 1 (0+1) (0+1 + 1)
// 0 1 (0+1) (0+1 + 1) (0+1 + 1 + 0+1)
// 0 1 1 2 3

int main() {
   int n = 5;
   int i;
	
   printf("Fibbonacci of %d: " , n);
	
   for(i = 0;i<n;i++) {
      printf("%d ",fibbonacci(i));            
   }
}