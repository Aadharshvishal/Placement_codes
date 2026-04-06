import java.util.Scanner;

public class main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number 1: ");
 int a = input.nextInt();
 System.out.print("Enter a number 2: ");
 int b = input.nextInt();
 System.out.print("Enter a number 3: ");
 int c = input.nextInt();
 if(a<b){
    if(a<c){
        System.out.print(a+" is the smallest");
    }
    else{
         System.out.print(c+" is the smallest");       
    }
 }
 else if(b<a){
    if(b<c){
        System.out.print(b+" is the smallest");
    }
    else{
         System.out.print(c+" is the smallest");       

    }
 }
  }
}