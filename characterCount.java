package StreamApi;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class characterCount {
    public static void main(String[] args) {
        String s="aabbbccdddee";
        List<Character> list = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        Map<Character, Long> charCount = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Count characters in string"+charCount);
    }
}
