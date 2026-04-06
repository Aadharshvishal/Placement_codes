import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=s.nextInt();
        int b=0;
        for(int i=0;i<=a;i++){
            b=b+i;
        }
        System.out.println("The added values are:"+b);
    }
}