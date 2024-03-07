class Question{
    public static void main(String[] args){
        int n = 10;
        switch(n){
            case 10: System.out.println(n*2); //20
            case 4: System.out.println(n*4); break; //40 and then breaks out of the switch statement
            default: System.out.println(n);
        }
    }
}