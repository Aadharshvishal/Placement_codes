public class main{
    public static void main(String[] args) {
        String s="Hello";
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.println("First unique: " + s.charAt(i));
                break;
            }
        }
    }
}