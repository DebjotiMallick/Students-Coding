import java.util.Scanner;

public class StonePaperScissors
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to stone paper scissors");
        System.out.println("Instructions: It is not a two player game, your opponent is computer. \nPick 1 for Stone, 2 for Paper, 3 for Scissors.");
        System.out.print("Please enter your choice: ");
        int userChoice = sc.nextInt();
        
        int computerChoice = (int)(Math.random()*3) + 1;
        //System.out.println(computerChoice);
        
        if (userChoice == computerChoice){
            if(userChoice == 1){
                System.out.println("You and computer both picked stone, hence it's a tie.");
            } else if(userChoice == 2){
                System.out.println("You and computer both picked Paper, hence it's a tie.");
            } else if(userChoice == 3){
                System.out.println("You and computer both picked Scissors, hence it's a tie.");
            }
        } else if (userChoice == 1){
            if (computerChoice == 2){
                System.out.println("You picked stone, computer picked paper, hence computer wins.");
            } else if (computerChoice == 3){
                System.out.println("You picked stone, computer picked scissors, hence you win.");                
            }
        } else if (userChoice == 2){
            if (computerChoice == 3){
                System.out.println("You picked paper, computer picked scissors, hence computer wins.");
            } else if (computerChoice == 1){
                System.out.println("You picked paper, computer picked stone, hence you win.");                
            }
        } else if (userChoice == 3){
            if (computerChoice == 1){
                System.out.println("You picked scissors, computer picked stone, hence computer wins.");
            } else if (computerChoice == 2){
                System.out.println("You picked scissors, computer picked paper, hence you win.");                
            }
        } else {
            System.out.println("Invalid Input."); 
        }
    }
}
