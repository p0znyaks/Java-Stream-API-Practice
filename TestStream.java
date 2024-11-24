package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("privet");
        list1.add("kak dela");
        list1.add("ok");
        list1.add("poka");

        List<Integer> list2 = list1.stream()
                .map(el -> el.length())
                .collect(Collectors.toList());

//        System.out.println(list1);
//        System.out.println(list2);

        int[] array1 = {5, 9, 3, 8 ,1};
        int[] array2 = Arrays.stream(array1)
                .map(el -> el % 3 == 0 ? el / 3 : el)
                .toArray();
//        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
