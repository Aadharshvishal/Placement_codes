import java.util.*;
public class sam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int secretNumber =7;
        int guess;
        System.out.println("Welcome to Number Guessing Game!");
        while(true){
            System.out.print("Enter your guess number:");
            guess =sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Correct! You guessed the number.");
                break;
            }
            else if (guess<secretNumber) {
                System.out.println("Too small! Try again.");
            }
            else{
                System.out.println("Too large! Try again.");
            }
        }
    }
}