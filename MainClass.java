import java.io.FileWriter;
public class MainClass{
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("Output.txt",true);
            fw.append(" Mann");
            fw.append(" is cheating in Exam");
            fw.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Something has happened");
        }
    }
}