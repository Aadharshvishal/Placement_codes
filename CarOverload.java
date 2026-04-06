class Vehicle {
    int car() {
        System.out.println("carloyee is working");
        return 0;
    }
    
    String car(String a) {
        System.out.println("Car Model : "+a);
        return a;
    }
    int cost() {
        System.out.println("Vehicle = 50,000");
        return 0;
    }
}

class car extends Vehicle {
    
    int car(int a) {
        System.out.println("Car Speed "+a);
        return 0;
    }
    int car() {
        System.out.println("car is running");
        return 0;
    }
}

public class CarOverload{
    public static void main(String[] args) {
        Vehicle d = new car();
        
        d.car("Ford");
        d.car();
        d.cost();
       
    }
}