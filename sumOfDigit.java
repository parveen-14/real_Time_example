package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sumOfDigit {
    public static void main(String[] args) {
//        List<Integer> inputNumbers = new ArrayList<>();
//        inputNumbers.add(123);
//        inputNumbers.add(45);
//        inputNumbers.add(67);
//        inputNumbers.add(89);

        int input=12345;
        IntStream stream=String.valueOf(input).chars();
        stream.map(Character::getNumericValue);

    }
}
