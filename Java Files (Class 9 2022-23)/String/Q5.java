class Q5{
    public static void main(String[] args){
        String str1 = "This is Exercise 2";
        String str2 = "This is Exercise 2";
        int result = str1.compareTo(str2);
        if(result < 0){
            System.out.println(str1 + " is less than " + str2);
        } else if(result > 0){
            System.out.println(str1 + " is greater than " + str2);
        } else if(result == 0){
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}