package StreamApi;

import java.util.Arrays;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(10,20,30,40,50);
       double avg= inputNumbers.stream()
                .mapToInt(num->num.intValue()) //converting into int primitive type.
                .average()//after using map can convert integer to int.
                .getAsDouble();
        System.out.println(avg);
    }
}
