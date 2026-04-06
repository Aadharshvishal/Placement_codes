public class main{
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            int r= a/b;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("No zero in division");
        }
}
}