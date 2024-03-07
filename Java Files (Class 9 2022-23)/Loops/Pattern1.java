// print the series 1 2 4 7 11 (difference between number increases by 1 each time)

class Pattern1{
    public static void main(String[] args){
        int num=1;
        int diff=1;

        for( ;num<=11; ){
            System.out.print(num + " ");
            num=num+diff;
            diff++;
        }
    }
}