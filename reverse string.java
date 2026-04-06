import java.util.*;
import java.lang.StringBuilder;
public class main{
    public static void main(String[] args) {
        String s="hello";
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println(r);
    }
}