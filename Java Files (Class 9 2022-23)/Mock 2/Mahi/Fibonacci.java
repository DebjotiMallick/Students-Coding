class Fibonacci{
    public static void main(String[] args){
        int n=2, sum = 0;
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        while(n < 20){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            n++;
        }
    }
}