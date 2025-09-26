//by default every method in interface is public , abstract 
//interface is not class
//we can implement multiple interface in a class only thing u have to define all methods

public class Interface{
    public static void main(String[] args) {
        Q obj = new J();
        obj.show();
        obj.config();

        System.out.println(Q.name); //harsh

        //Q.name = "Ram"; : error

        //obj.fly(); : error
        P obj1 = new J();
        obj1.fly();
    }
}

//inheritance
interface X extends Q{

}

interface Q{

    //every variable in interface is by default final and static
    //int age; : error


    //now these variables are final and static
    int age = 44;
    String name = "Harsh";

    void show();
    //public abstract void show() : both are same
    void config();
}

interface P{
    void fly();
}

class J implements Q,P{   //by default abstract class whether we write abstract or not
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
    public void fly(){
        System.out.println("in fly");
    }
}

// class-class : extends
// interface - class : implements
// interface-interface : extends