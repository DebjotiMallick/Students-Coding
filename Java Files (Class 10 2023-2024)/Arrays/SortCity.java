import java.util.Scanner;

class SortCity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = "";
        String country[] = new String[5];
        System.out.println("Enter country name: ");
        for (int i = 0; i < 5; i++){
            country[i] = sc.next();
        }

        for (int i = 0; i < country.length; i++){
            for (int j = i; j < country.length; j++){
                if (country[j].compareTo(country[i]) < 0){
                    temp = country[i];
                    country[i] = country[j];
                    country[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Country: " + country[i] + " "); 
        }
    }
}