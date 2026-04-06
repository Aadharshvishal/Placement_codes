public class Main{
    int x =10,y=2;
    String a ="Aadharsh";
    String b ="Vishal";
    public static void main(String[] args) {
        Main myObj = new Main();
        Second my = new Second();
        System.out.println("Add "+(myObj.x+myObj.y));
        System.out.println("Sub "+(myObj.x-myObj.y));
        System.out.println("Mul "+(myObj.x*myObj.y));
        System.out.println("Div "+(myObj.x/myObj.y));
        System.out.println("Name  "+(myObj.a+myObj.b));
        System.out.println("Name  "+(my.g));

    }
}