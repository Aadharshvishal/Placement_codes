class Student {

    void calculateAverage(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average Marks: " + avg);
    }
}

public class marksaverage {
    public static void main(String[] args) {
        Student s = new Student();
        s.calculateAverage(80, 90, 70);
    }
}