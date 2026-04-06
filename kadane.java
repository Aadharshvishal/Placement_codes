import java.util.Scanner;
public class Kad{
    public static void main(String[] args) {
     int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
     int m_sum = arr[0];
     int c_sum = arr[0];
      for(int i =1;i<arr.length;i++){
        c_sum = Math.max(arr[i],c_sum+arr[i]);
        m_sum = Math.max(m_sum,c_sum);
      }  
      System.out.println("max sum is: "+m_sum); 
    }
}