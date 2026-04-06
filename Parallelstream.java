import java.util.*;

public class Parallelstream{
    public static void main(String[] args) {
        List<Integer> nu = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Stream : ");
        nu.stream()
        .forEach(n->System.out.println(Thread.currentThread().getName()+" "+n));
        System.out.println("\nparallel Stream");
        nu.parallelStream()
        .forEach(n->System.out.println(Thread.currentThread().getName()+" "+n));

    }
}