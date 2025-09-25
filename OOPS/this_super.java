//everytime we make the obj constructor is called
//when we create object it call constructor of subclass and supercalss both
//every constructor should have super which calls the super class constructor by default
//every class in java extends object class whether we mention it or not
//this will execute constructor of same class

public class this_super {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(90); 
    }
}

class A{
    public A(){
        super(); //whether we write it or not it is always there
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A in parameter");
    }
}

class B extends A{
    public B(){ //constructor name same as class name (constructor)
        super();
        System.out.println("in B");
    }

    public B(int n){ //parameterized constructor
        this(); //it will call both constructor of B class
        //super(n); // if we dont write n in bracket it will call default constructorof A not parameterised
        System.out.println("in B in parameter");
    }
}




//Anonymous object
