public class Lecture3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 78;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Gaurav";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Raghav";
        s3.marks = 67;

        System.out.println(s1); //it will print addreass no the actual values

        Student arr[] = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;  

        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.println(arr[i].name + " : " + arr[i].marks );
        // }


        //by enhanced for loop
        for(Student i : arr){
            System.out.println(i.name + " : " + i.marks);
        }
    }

}

class Student{
    int rollno;
    String name;
    int marks;
}
