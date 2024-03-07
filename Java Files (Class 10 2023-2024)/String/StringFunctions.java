class StringFunctions{
    public static void main(String[] args){
        // String str = "Hello World!";

        // int l = str.length(); // checks the number of characters in the string, space and special characters are also counted
        // System.out.println("Length of the string: " + l);

        // char c = str.charAt(6); // gets the character at the specified position, counting starts with 0
        // System.out.println("6th character is " + c);

        // int p = str.indexOf('d'); // gets the index of the specified character in the string
        // System.out.println("Index of 'd' is " + p);

        // int q = str.indexOf('l', 5); // gets the index of the specified character after the position in the string
        // System.out.println("Index of 'l' after 5th position is " + q);

        // int s = str.indexOf('e', 2); // since e does not exist after 2nd position, we get -1 in return
        // System.out.println(s);

        // int last = str.lastIndexOf('o'); // if multiple occurence of same letter, then get the last occuring position
        // System.out.println("Last occurence of 'o' is " + last);

        // String s1 = "New Zealand";
        // String s2 = s1.substring(0,3);
        // System.out.println("The substring is " + s2);

        // String s = "CAR";
        // String t = s.toLowerCase();
        // System.out.println("After conversion the string is " + t);

        // String s = "flower";
        // String t = s.toUpperCase();
        // System.out.println("After conversion the string is " + t);

        // String s = "ELEPHANT";
        // String t = s.replace('E', 'I');
        // System.out.println("After conversion the string is " + t);

        // String a = "One";
        // String b = "Two";
        // String c = a.concat(b);
        // System.out.println("Concatenated string is " + c);


        String s1 = "one"; // ascii 97
        String s2 = "ONE"; // ascii 65
        // if s1 > s2, it returns positive number  
        // if s1 < s2, it returns negative number  
        // if s1 == s2, it returns 0  
        int result = s1.compareTo(s2);
        int result2 = s1.compareToIgnoreCase(s2);
        System.out.println(result);
        System.out.println(result2);


        // char c = 'A';

        // if(Character.isLetter(c) == true){
        //     System.out.println("Yes");
        // }
        
    }
}