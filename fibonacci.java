import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=s.nextInt();
        int f1=0,f2=1;
        System.out.println(f1+"\n"+ f2);
        for(int i=0;i<=a;i++){
            System.out.println(f1+f2);
            int c=f1+f2;
            f1=f2;
            f2=c;
            }
    }
}