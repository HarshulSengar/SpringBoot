package core_java;
import java.util.*;
import java.util.stream.Stream;
public class Stream_Api {
    public static void main(String[] args) {

        // //Stream provides functions : filter , map , reduce
        List<Integer> nums = Arrays.asList(4,9,1,5,3);
        //nums.forEach(n -> System.out.println(n));  //prints the entire list

        Stream<Integer> s1 = nums.stream(); //all the values in nums copy to s1 and we do any change in s1 does not affect nums
        //s1.forEach(n-> System.out.println(n)); //stream executes only once . if i write same line again it will give error or if i call any other stream still gave error
        //we can call only one stream at a time only once

        //even numbers by filter
        //Stream<Integer> s2 = s1.filter(n-> n%2==0);
        //s2.forEach(n-> System.out.println(n));

        //doubly values by map

        Stream<Integer> s3 = s1.map(n-> n*2);
        //s3.forEach(n-> System.out.println(n));

        //reduce give single value
        int res = s3.reduce(0,(c,e)->c+e); //sum of all doubled values
        System.out.println(res);









        // //short way
        // int res = nums.stream()
        //     .filter(n->n%2==0)
        //     .map(n->n*2)
        //     .reduce(0,(c,e)->c+e);

        // System.out.println(res);


    }
}
