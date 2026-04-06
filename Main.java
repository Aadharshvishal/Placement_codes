import java.util.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<String>();
        car.add("Ford");
        car.add("BMW");
        car.add( "Audi");
        car.add("Benz");
        car.add("Toyota");
        car.add("Honda");

        Collections.sort(car);

        for (String i : car) {
            System.out.println(i);
        }
    }
}