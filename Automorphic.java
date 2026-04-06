import java.util.Scanner;

public class automorphic{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num: ");
        int n=s.nextInt();
        int square = n*n;
        int count=0;
        int temp=0;
        while (temp>0){
            count++;
            temp=temp/10;
        }
        int lastdigit=square % (int)Math.pow(10, count);
        if (n==10){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an Automorphic number");
        }
    }
}