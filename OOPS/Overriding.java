import java.util.*;
public class Overriding {
    public static void main(String[]args){
        B obj1 = new B();
        obj1.show(); //in A config
        obj1.config(); // in A show
        //if we dont override it will prit A values
    }
}

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    //here we are defining the function again which is already defined in oarent calss : overidinig
    @Override
    public void show(){
        System.out.println("in A config");
    }
    @Override
    public void config(){
        System.out.println("in A show");
    }
}
