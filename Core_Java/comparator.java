
package core_java;
import java.util.*;
public class comparator {
    public static void main(String[] args) {

        // Comparator<Student> com = new Comparator<Student>(){  //comparator is an interface for sorting
        //     public int compare(Student i , Student j){

        //         //done by swapping basically
        //         if(i.age > j.age){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // } ;

        //in one line
        Comparator<Student> com = (i,j) -> i.age > j.age ? 1 : -1;

        List<Student> ans = new ArrayList<>();
        ans.add(new Student(42, "Raghav"));
        ans.add(new Student(37, "Priyang"));
        ans.add(new Student(29, "Mansi"));
        ans.add(new Student(26, "divya"));

        for(Student s : ans){
            System.out.println(s);
        }

        //sort values based on age
        Collections.sort(ans,com);

        System.out.println(ans);
    }
}

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString(){
        return "Student [age=" + age + " , name=" + name + "]";
    }
}
