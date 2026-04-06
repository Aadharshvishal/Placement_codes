public class main{
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            int r= b/a;
            int d[]= new int[3];
            d[10]=0;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("No zero in division");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }
}
}