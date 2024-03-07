class FunctionOverload2{

    void display(){
        int i, j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void display(int n){
        int num = n;
        int rem=0;
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            System.out.println(Math.sqrt(rem));
        }
    }

    public static void main(String[] args){
        FunctionOverload2 func = new FunctionOverload2(); // object creation
        func.display();
        func.display(4329);

        func.series();
        func.series(5);
        func.series(3,4);
    }
}