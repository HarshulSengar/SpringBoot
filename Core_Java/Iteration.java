package core_java;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        System.out.println("hello");

        Comparator<Integer> com = new Comparator<Integer>(){  //comparator is an interface for sorting
            public int compare(Integer i , Integer j){

                //done by swapping basically
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        } ;

        List<Integer> ans = new ArrayList<>();
        ans.add(41);
        ans.add(60);
        ans.add(25);
        ans.add(43);

        Iterator<Integer> val = ans.iterator();
        //val.next(); //give next element but only one element
        while(val.hasNext()){ //hasnext tells we have next value or not
            System.out.println(val.next());
        }

        //sort based on last digit
        Collections.sort(ans, com);
        // for(int i : ans){
        //     System.out.println(i);
        // }
        System.out.println(ans);
    }
}

//hashtable : synchronized
//hashmap : unsynchronized
