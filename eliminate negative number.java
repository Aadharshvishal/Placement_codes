import java.util.*;
public class main{
    public static void main(String[] args){
        int[] numbers={3,-1,0,4,-5,-1};
        for(int  n:numbers){
            if(n<0){
                continue;
            }
            if(n==0){
                break;
            }
            System.out.println(n);
        }
    }
}