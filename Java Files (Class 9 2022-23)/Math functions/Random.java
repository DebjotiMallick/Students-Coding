class Random{
    public static void main(String[] args){
        int i;
        double rand = 0.0;
        for(i = 1; i <= 5; i++){
            rand = Math.random()*10 + 10;
            System.out.println(rand);
        }
    }
}