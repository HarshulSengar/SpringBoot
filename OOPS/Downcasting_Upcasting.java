import java.util.*;
public class Downcasting_Upcasting {
    public static void main(String[] args){
        Ac obj = (Ac)new Bc(); //upcasting : upperclass conversion (parent)
        obj.show1();

        Bc obj1 = (Bc) obj; //downcasting 
        obj1.show2();
    }
}

class Ac{
    public void show1(){
        System.out.println("in A Show");
    }
}

class Bc extends Ac{
    public void show2(){
        System.out.println("in B show");
    }
}
