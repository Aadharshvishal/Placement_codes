import java.util.*;
public class main{
    public static void main(String[] args) {
        String s="Java is great";
        String[] w=s.split(" ");
    for(int i=w.length - 1;i>=0;i--){
        System.out.println(w[i]+" ");
    }
    }
}