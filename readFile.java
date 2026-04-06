import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
            File myObj = new File("filename.txt");
        try {
            Scanner sr = new Scanner(myObj);
            while(sr.hasNextLine()){
                String d= sr.nextLine();
                System.out.print(d);
            }

            System.out.println(" Success");
        } catch (FileNotFoundException e) {
            System.out.println("Something has happened");
            e.printStackTrace();
        }
    }
}