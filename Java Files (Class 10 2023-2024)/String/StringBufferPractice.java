class StringBufferPractice{
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer(); // allocates an empty space in memory to store string
        StringBuffer sb2 = new StringBuffer("Paris"); // allocates memory for variable sb2 and initializes it with string "Paris"
        StringBuffer sb3 = new StringBuffer(" London"); // allocates memory for variable sb3 to store string upto 20 characters
        sb2.setCharAt(0, 'D'); // first is index, second is character to replace with
        System.out.println(sb2.toString());
    }
}