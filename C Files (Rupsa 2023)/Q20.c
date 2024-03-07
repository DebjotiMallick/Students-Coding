#include<stdio.h>
#include<math.h>

int GCD(int i, int j){
   if(j>i)
      return GCD(j,i);
   if(j==0)
      return i;
   else
      return GCD(j,i%j);
}

/* input: 4 6
return GCD(6,4)
return GCD(4,6%4) / GCD(4,2)
return GCD(2,4%2) / GCD(2,2)
return GCD(2,2%2) / GCD(2,0)
return i=2
*/

int main(){
   int a,b;
   printf("Enter the two integers: ");
   scanf("%d %d",&a, &b);
   printf("GCD of %d and %d is %d",a,b,GCD(a,b));
   return 0;
}

