@FunctionalInterface
interface Animal {
    void sound(int i,int j);
}

public class lamdapara{
    public static void main(String[] args) {
        Animal a = (i,j) -> System.out.println("Dog Barks "+i*j);
        a.sound(10,3);
    }
}