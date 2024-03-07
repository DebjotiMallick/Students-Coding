class Basic{

    public static void main(String[] args){
        for (int i = 0; i < 5; i++){ 
            printName("Mahi"); // calling the function with paramters/arguments
        }
    }

    // user defines function/method which has one println statement
    public static void printName(String name){ // name variable captures value of name when function was called
        System.out.println("My name is " + name);
    }
}