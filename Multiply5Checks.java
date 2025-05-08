package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Multiply5Checks {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(54);
        list.add(98);
        list.add(80);
        list.add(15);
        list.add(25);

       //list.stream().filter(i->i%5==0).forEach(System.out::println);
        List<Integer> list1=list.stream().filter(n->n%5==0).collect(Collectors.toList());
        System.out.println("List of the multiple" +list1);

        //------------------------->
        List<Integer> list2=list.stream().filter(n->n%5==0).map(i->i*i).collect(Collectors.toList());
        System.out.println("Square of the multiple" +list2);


    }
}
