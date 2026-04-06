import java.util.Deque;
import java.util.ArrayDeque;
public class deque{
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.addFirst("Element 1");
        deque.addLast("Element 2");
        deque.push("Element 0");
        System.out.println("Deque: "+deque);
        String first=deque.removeFirst();
        String last=deque.removeLast();
        System.out.println("first: "+first);
        System.out.println("last: "+last);
        System.out.println("removals: "+deque);
    }
}