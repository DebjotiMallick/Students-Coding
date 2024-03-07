class Char{
    public static void main(String[] args){
        char a = 'A'; // character
        char b = '8'; // number
        char c = '*'; // special character

        boolean result1 = Character.isLetter(a); // checks if it is a letter

        boolean result2 = Character.isDigit(c); // checks if it is a digit/number

        boolean result3 = Character.isLetterOrDigit(c); // checks if it is a letter or a digit

        boolean result4 = Character.isUpperCase(a); // checks if it is an upper case letter

        boolean result5 = Character.isLowerCase(a); // checks if it is a lower case letter

        char result6 = Character.toUpperCase(a); // converts any character to upper case

        char result7 = Character.toLowerCase(a); // converts any character to lower case

        System.out.println(result7);
    }
}