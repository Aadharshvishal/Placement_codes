class Student{
    String name;
    int rollNo;

    static String collage="ABC Collage";
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Collage: "+collage);
    }
}
public class college{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Pheonix";
        s1.rollNo=1;
        s1.display();
    }}