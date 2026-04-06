import java.io.FileWriter;
import java.io.IOException;
public class writer {
    public static void main(String[] args) {
        try {
            FileWriter writer= new FileWriter("filename.txt");
            writer.write("Files in java might be tricky");
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
