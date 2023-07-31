import java.util.*;
import java.util.stream.*;

public class streamapi1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> str1 = list.stream();
        // Stream<Integer>filter1=str1.filter(n->n%2==0);
        // Stream<Integer>sort1=filter1.sorted();
        // Stream<Integer>map1=sort1.map(n->n*2);
        // map1.forEach(n->System.out.println(n));
        // list.forEach(n->System.out.println(n));

        Stream<Integer> filter1 = str1.filter(n -> n % 2 == 0).sorted().map(n -> n * 2);
        filter1.forEach(n -> System.out.println(n));
    }
}
