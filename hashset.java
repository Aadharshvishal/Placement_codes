import java.util.*;

public class Hashset{
    public static void main(String[] args) {
        HashSet<String> c=new HashSet<String>();
        c.add("Java");
        c.add("Python");
        c.add("C++");
        c.add("Java");
        for (String i : c) {
            System.out.println(i);
        }
        System.out.println(c);
    }
}