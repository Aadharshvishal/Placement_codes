import java.sql.*;
public class connectivity {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
            System.out.println("Success");
            c.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
