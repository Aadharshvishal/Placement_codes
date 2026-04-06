import java.io.BufferedWriter;
import java.io.FileWriter;
public class Filebuffer {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("Output.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Hey Mann");
            bw.newLine();
            bw.write("Hello");
            bw.close();
            System.out.println("Success");
        }
        catch (Exception e) {
            System.out.println("Something happened");
        }
    }
}
