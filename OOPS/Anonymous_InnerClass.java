import java.util.*;
public class Anonymous_InnerClass {
    public static void main(String[] args) {
        Am obj = new Am()
        {   //Anonymous class
            public void show(){
                System.out.println("in new Show");
            }
        };
        obj.show(); //print newly defined show func : in new show

    }
}

    class Am{
        public void show(){
            System.out.println("in A show");
        }
    }

