@FunctionalInterface
interface Animal {
    void sound();
}

public class functionalinterface{
    public static void main(String[] args) {
        Animal a = () -> System.out.println("Dog Barks");
        a.sound();
    }
}