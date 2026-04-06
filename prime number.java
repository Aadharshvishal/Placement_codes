import java.util.*;

public class prime{
    public static void main(String[] args) {
        Scanner sr= new Scanner (System.in);
        System.out.println("Enter the number :");
        int n= sr.nextInt();
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c!=0){
            System.out.println(i+" Not an prime number");
            }
            else{
            System.out.println(i+" an prime number");
               
            }

        }

    }
}