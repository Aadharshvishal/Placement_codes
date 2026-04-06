import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        int m=a[0];
        for(int i=0;i<5;i++){
            if(a[i]>=m){
                m=a[i];
            }
        }
        System.out.println("The max value is: "+m);
    }
}