package Stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int resultOfSumElementsInArray = Arrays.stream(array)
                .filter(el -> el % 2 != 0)
                .map(el -> el % 3 == 0 ? el / 3 : el)
                .reduce(0,(acc, el) -> acc + el);
        System.out.println(resultOfSumElementsInArray);

//        int result = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 != 0) {
//                if(array[i] % 3 == 0) {
//                    array[i] = array[i] / 3;
//                }
//            } else {
//                array[i] = 0;
//            }
//            result += array[i];
//        }
//        System.out.println(result);
    }
}
