import java.util.*;

public class sam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userChoice, computerChoice;
        int userScore = 0;
        int computerScore = 0;

        String[] options = {"Rock", "Paper", "Scissor"};

        for(int round = 1; round <= 5; round++){

            System.out.println("\nRound " + round);
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");

            System.out.print("Enter your choice: ");
            userChoice = sc.nextInt();

            computerChoice = rand.nextInt(3) + 1;

            System.out.println("Computer chose: " + options[computerChoice-1]);

            if(userChoice == computerChoice){
                System.out.println("Match Draw");
            }
            else if(userChoice == 1 && computerChoice == 3 ||
                    userChoice == 2 && computerChoice == 1 ||
                    userChoice == 3 && computerChoice == 2){
                System.out.println("You Win this round!");
                userScore++;
            }
            else{
                System.out.println("Computer Wins this round!");
                computerScore++;
            }

            System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore);
        }

        System.out.println("\nFinal Result");

        if(userScore > computerScore){
            System.out.println("You Win the Game!");
        }
        else if(computerScore > userScore){
            System.out.println("Computer Wins the Game!");
        }
        else{
            System.out.println("Game Draw");
        }
    }
}