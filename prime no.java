import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=s.nextInt();
        System.out.println("Enter number:");
        int b=s.nextInt();
        for(int i=2;i<a;i++){
            if (a%i==0){
                b++;
            }
            }
            if(b==0){
                System.out.println(a+" is a prime number.");
        }
        else{
            System.out.println(a+" is not a prime number.");
        }
    }
}