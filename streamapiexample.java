package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamapiexample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<String> stream=list.stream();

        //If we have array then how to convert into stream.
        String[] arr={"Apple","Banana","Mango","Orange"};
        Stream<String> stream1 =Arrays.stream(arr);
    }
}
