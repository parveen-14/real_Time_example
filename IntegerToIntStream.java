package StreamApi;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerToIntStream {
    public static void main(String[] args) {

        Stream<Integer> integerstream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntStream intstream = integerstream.mapToInt(new ToIntFunction<Integer>() {
                                                @Override
                                                public int applyAsInt(Integer value) {
                                                    return value;
                                                }
                                            });
        System.out.println(intstream.sum());



        //------------------------------>
//        Stream<Integer> integerstream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        IntStream intstream = integerstream.mapToInt(Integer::valueOf);
//                System.out.println(intstream.sum());

       // -------------------------->
//        Stream<Integer> integerstream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        IntStream intstream = integerstream.mapToInt(value -> value);
//        System.out.println(intstream.sum());
    }
}
