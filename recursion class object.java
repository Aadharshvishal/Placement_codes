public class recursion{
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }         
        }
        public static void main(String[] args){
            int x=5;
            System.out.println(sum(5)); 
    }
}