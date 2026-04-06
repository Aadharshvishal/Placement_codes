import java.util.*;
public class main{
    public static void main(String[] args){
        String s1="Hello";
        String s2=s1.concat(" World");
        System.out.println(s2);
        System.out.println("Length: "+s2.length());
        System.out.println("UpperCase: "+s2.toUpperCase());
        System.out.println("LowerCase: "+s2.toLowerCase());
        String s="            collegg";
        System.out.println(s.substring(1, 3));
        System.out.println(s.replace("coll","call"));
        System.out.println(s.trim());
        System.out.println(s.indexOf("l"));
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s.contains("l"));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        
    }
}