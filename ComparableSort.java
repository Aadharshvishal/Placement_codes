import java.util.*;

class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
}
public class ComparableSort{
    public static void main(String[] args) {
        ArrayList<Student>list= new ArrayList<>();
        list.add(new Student("Kayea",60));
        list.add(new Student("Jean",100));
        list.add(new Student("Diluc",50));
        list.add(new Student("Mona",90));
        list.add(new Student("Varka",80));

        Collections.sort(list);

        for(Student s:list){
            System.out.println(s.name+" "+s.marks);
        }
    }
}