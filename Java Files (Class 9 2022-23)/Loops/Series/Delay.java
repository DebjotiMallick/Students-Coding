class Delay{
    public static void main(String[] args){
        int i;
        double sum = 0;
        System.out.println("Before delay");
        for (i=0; i < 1000000000; i++){
            sum = sum * i;
        }
        System.out.println("After delay");
    }
}