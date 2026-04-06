interface animal{
    void sound();
}
public class animallambda{
    public static void main(String[] args) {
        animal a=new animal(){
        @Override
        public void sound(){
            System.out.println("Dog barks");
        }
    };
    a.sound();
    }
}