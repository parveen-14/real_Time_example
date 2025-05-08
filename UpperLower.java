package StreamApi;

import java.util.Arrays;
import java.util.List;

public class UpperLower {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mango","Banana","Orange","Apple");
        list.stream().map(String::toUpperCase).forEach(e-> System.out.println("Uppercase: " +e));
        list.stream().map(String::toLowerCase).forEach(e-> System.out.println("Lowercase: " +e));

    }
}
