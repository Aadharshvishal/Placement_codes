import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=s.nextInt();
        System.out.println("Enter Number");
        int b=s.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("the swapped number 1:"+a);
        System.out.println("the swapped number 2:"+b);
        

    }
}