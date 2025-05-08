package StreamApi;

import java.util.*;
import java.util.stream.*;

public class UnsortTwoOneArray {
    public static void main(String[] args) {

        int[] a = new int[]{1, 3, 2, 3, 1, 5, 5, 6, 7, 8, 8, 9, 10};
        int[] b = new int[]{1, 3, 2, 5, 5, 6, 7, 4, 2, 4, 5, 5, 10};

        IntStream intStream =IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .sorted();
        intStream.forEach(e-> System.out.println(e));


//        Integer[] a={1,2,3,4,2,3,4,5,6,7,6,7,10,10};
//        Integer[] b={1,3,5,6,7,8,2,10,4,5,7,10,9,8};
//
//       Integer[] sort= Stream.concat(Arrays.stream(a), Arrays.stream(b)).
//                distinct()
//                .sorted()
//                .toArray(Integer[]::new);
//
//    System.out.println(Arrays.toString(sort));



}
}
