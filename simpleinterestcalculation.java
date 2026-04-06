class Interest {
    int p = 1000;
    int r = 5;
    int t = 2;
    void calculate() {
        int si = (p * r * t) / 100;
System.out.println("Simple Interest: " + si);
  }
}
public class simpleinterestcalculation {
    public static void main(String[] args) {
        Interest i1 = new Interest();
        i1.calculate();
  }
}