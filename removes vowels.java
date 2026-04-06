import java.util.*;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                    result.append(ch);
                }
            }
        }
        System.out.println("String after removing vowels: " + result);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}