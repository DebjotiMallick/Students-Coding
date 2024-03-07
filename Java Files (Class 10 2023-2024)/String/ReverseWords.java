/* Wap to accept a string and display it in reverse order.
Input: i like playing cricket
Output: cricket playing like i
*/

class ReverseWords{
    public static void main(String[] args){
        
        String line = " this is new year of decade something";
        String newString = "";
        int len = line.length();
        int space = 0;
        for(int i = 0; i < len; i++){
            if(line.charAt(i) == ' '){
                space++;
            }
        }

        for(int j = 0; j < space; j++){
            int last = line.lastIndexOf(" "); // last index of space present
            String word = line.substring(last+1); // get the last word from that index
            newString = newString + word + " "; // append that word in new string variable
            line = line.substring(0,last); // reduce the original string by removing the last word each time
        }
        
        System.out.println(newString);


    }
}