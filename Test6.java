package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
//        List<Integer> list = stream1.filter(el -> {
//            System.out.println("!!!");
//            return el % 2 == 0;
//        }).collect(Collectors.toList());
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);

//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        stream4.forEach(System.out::println);

//        System.out.println(stream1.distinct().count());
        long result = stream1.distinct().peek(System.out::println).count();
        System.out.println(result);
    }
}
