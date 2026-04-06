import java.util.*;
public class RemoveVowels {
    public static void main(String[] args){
        String s="JAVA is Great";
        int vowels =0;
        int consonents=0;
        for (char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonents);
    }
}