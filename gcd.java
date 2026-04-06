import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=s.nextInt();
        System.out.println("Enter number:");
        int b=s.nextInt();
        int gcd=1;
        for (int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD= "+gcd);
        int lcm=(a*b)/gcd;
        System.out.println("LCM= "+lcm);
    }
}