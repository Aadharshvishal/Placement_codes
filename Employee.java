class Manager {
    int Emp() {
        System.out.println("Employee is working");
        return 0;
    }
    
    int Emp(int a) {
        System.out.println("Emp : "+(a));
        return 0;
    }
    int Man() {
        System.out.println("Manager salary = 50,000");
        return 0;
    }
}

class Emp extends Manager {
    
    int Emp(int a) {
        System.out.println("Employee working "+a+" hours");
        return 0;
    }
    int Emp() {
        System.out.println("Employee is working");
        return 0;
    }
}

public class Employee{
    public static void main(String[] args) {
        Manager d = new Emp();        
        d.Emp(10);
        d.Emp();
        d.Man();
       
    }
}