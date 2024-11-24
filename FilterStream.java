package Stream;

import Lambda.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStream {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students.stream()
//                .map(st -> {
//                    st.setName(st.getName().toUpperCase());
//                    return st;
//                })
//                .filter(st -> st.getSex() == 'f')
//                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
//                .forEach(System.out::println);

        Student first = students.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .findFirst().get();
        System.out.println(first);
//        students = students.stream()
//                .sorted((x, y) -> x.getName().compareTo(y.getName()))
//                .collect(Collectors.toList());
//        System.out.println(students);
//       List<Student> list1 = students.stream()
//                .filter(el ->
//                        el.getAge() > 22 &&
//                        el.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
//        System.out.println(list1);

        int[] array = {6, 3, 2, 8, 4};
//        Arrays.stream(array).forEach(System.out::println);
//        int result = Arrays.stream(array).reduce((acc, el) -> acc*el).getAsInt();
//        System.out.println(result);

        int result100 = Arrays.stream(array).reduce(1, (acc, el) -> acc*el);
        System.out.println(result100);
    }
}
