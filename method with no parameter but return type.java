public class Main {
    int getNumber() {
        int num = 50;
        return num;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int result = obj.getNumber();
        System.out.println("Number = " + result);
    }
}