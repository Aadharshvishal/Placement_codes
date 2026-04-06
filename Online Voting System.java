import java.util.*;
import java.util.Arrays;
public class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("TamilNadu Voting Area");
        System.out.println("Enter Full Name: ");
        String name=s.nextLine();
        System.out.println("Enter Aadhar Card: ");
        int Aadhar=s.nextInt();
        System.out.println("Enter Date of Birth: ");
        int DOB=s.nextInt();
        System.out.println("Enter age: ");
        int age=s.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote proceed to the voting venue.");
            String candidates[]={"Saber","Insane","Pheonix","Aizen","Dark","Lelouch"};
            int votes[]=new int[6];
            System.out.println("\nCandidates List");
            for(int i=0;i<candidates.length;i++){
                System.out.println((i+1)+"."+candidates[i]);
            }
            System.out.println("Enter candidate number to vote: ");
            int choice=s.nextInt();
            if(choice>=1 && choice<=candidates.length){
                votes[choice-1]++;
                System.out.println("Vote recorded successfully");
            }
            else{
                System.out.println("Invalid candidate");
            }
            int max=votes[0];
            int winner=0;
            for(int i=1;i<votes.length;i++){
                if(votes[i]>max){
                    max=votes[i];
                    winner=i;
                }
            }
            System.out.println("Winner is: "+candidates[winner]+" with "+max+" votes");
        }
        else{
            System.out.println("You are not eligible to vote so do vote when you are at the age of 18 and more.");
        }
    }
}