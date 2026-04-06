import java.util.*;
public class Fiss{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int a=s.nextInt();
        int f=0,b=0,fb=0;
        for(int i=0;i<a+1;i++){
            if (i%3==0 && i%5==0){
                System.out.println(i+" - FissBuss");
                fb++;
            }
            else if(i%3==0){
                System.out.println(i+" - Fiss");
                f++;
            }
            else if(i%5==0){
                System.out.println(i+" - Bus");
                b++;
            }
            else{
                System.out.println(i);
            }
        }
            System.out.println("total fiss:"+f);
            System.out.println("total bus:"+b);
            System.out.println("total fissbus:"+fb);
        
    }
}