package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayCountelElmnt {
    public static void main(String[] args) {

//        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
//
         int[] arr=new int[]{1,2,3,2,1,1,1,3,5,6,4,};
//        for(int i=0;i< arr.length;i++) {
//            if(h.containsKey( arr[i])) {
//                h.put(arr[i], h.get(arr[i]) + 1);
//                //h.put(arr[i], h.get(arr[i]) + 1);
//            }
//            else
//            {
//                h.put(arr[i], 1);
//                }
//            }
//        System.out.println(h);

        //------------------------------------------>
      Map<Integer,Long> frequency= Arrays.stream(arr)
              .boxed()
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequency);
        //---------------------------------------->

//        int[] arr=new int[]{10,20,40,44,44,66,55,66,20,10};
//        Map<Integer,Long> freq=Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(freq);

        }
    }


