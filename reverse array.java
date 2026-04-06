import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Enter 5 numbers : ");
        for(int i=0;i<5;i++){
            a[i]=sr.nextInt();
        }
         System.out.println("Reverse : ");
        for(int i=4;i>=0;i--){
        System.out.println(a[i]);
        }
    }
}