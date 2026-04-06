import java.util.PriorityQueue;
import java.util.Queue;
public class geeks{
    public static void main(String[] args) {
        Queue<Integer>pq=new PriorityQueue<>();
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        System.out.println("elements: "+pq);
    }
}