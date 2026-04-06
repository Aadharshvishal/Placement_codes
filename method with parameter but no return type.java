public class Main {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.add(10, 20);
    }
}