import java.util.*;
public class main{
    public static void main(String[] args) {
        int[] scores={70,75,80,85,90,95,100};
        System.out.println("The first score is: "+scores[0]);
        System.out.println("The third score is: "+scores[2]);
        scores[1]=76;
        System.out.println("The uploaded second score is: "+scores[1]);
        int arrayLength=scores.length;
        System.out.println("The length of array is: "+arrayLength);
        for(int i=0;i<scores.length;i++){
            System.out.println("Score of index "+i+": "+scores[i]);
        }
    }
}