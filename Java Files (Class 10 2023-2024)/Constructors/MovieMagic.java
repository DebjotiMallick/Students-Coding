import java.util.Scanner;

class MovieMagic{
    int year;
    String title;
    float rating;
    Scanner sc = new Scanner(System.in);
    MovieMagic(){
        year = 0;
        rating = 0.0f;
        title = "";
    }

    void accept(){
        System.out.println("Enter year, title and rating: ");
        year = sc.nextInt();
        sc.nextLine();
        title = sc.nextLine();
        rating = sc.nextFloat();
    }

    void display(){
        if(rating <= 2.0){
            System.out.println(title + " Flop");
        } else if(rating >= 2.1 && rating <= 3.4){
            System.out.println(title + " Semi-Hit");
        } else if(rating >= 3.5 && rating <= 4.5){
            System.out.println(title + " Hit");
        } else if(rating >= 4.6 && rating <= 5.0){
            System.out.println(title + " Super-Hit");
        }
    }

    public static void main(String[] args){
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}