public class Main {
    int multiply(int a, int b) {
        int result = a * b;
        return result;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int answer = obj.multiply(5, 4);
        System.out.println("Multiplication = " + answer);
    }
}