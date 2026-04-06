import java.util.*;
import java.util.stream.Collectors;

public class streamUpper {
    public static void main(String[] args) {
        List<String> n = Arrays.asList("Jean","Raiden","Mico");
        List<String> d = n.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList()); 

        System.out.println("Original : " + n);
        System.out.println("Upper case : " + d); 
    }
}
