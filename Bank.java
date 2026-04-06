public class Bank {
    
    int interest(int a) {
        return (a*5/100);
    }
    int interest(int a, int b) {
        return (a*b/100);
    }
    public static void main(String[] args) {
        Bank B = new Bank();
        System.out.println("interest: " + B.interest(10000));
        System.out.println("interest: " + B.interest(10000,20));
    }
}