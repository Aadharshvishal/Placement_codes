import java.util.*;
public class main{
    public static void main(String[] args) {
        int[][] myNumbers={{1,4,2},{3,6,8,5,2}};
        for(int row =0;row<myNumbers.length;row++){
            for(int col =0;col<myNumbers.length;col++){
                System.out.println("myNumbers[" +row+ "][" +col+ "]= "+ myNumbers[row][col]);
        }
        }
    }
}