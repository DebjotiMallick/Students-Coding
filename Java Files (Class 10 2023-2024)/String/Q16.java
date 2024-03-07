/* wap to print and locate the position of the first vowel in a word if the program has no vowels print an according statement */

class Q16{
    public static void main(String[] args){
        String word = "apple";
        word = word.toUpperCase();
        int flag = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U'){
                System.out.println("First vowel found at " + i + " position");
                flag++;
                break;
            }
        }

        if(flag==0){
            System.out.println("No vowel found.");
        }
    }
}