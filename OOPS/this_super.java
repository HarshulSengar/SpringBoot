//everytime we make the obj constructor is called
//when we create object it call constructor of subclass and supercalss both
//every constructor should have super which calls the super class constructor by default

public class this_super {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 new B(90);
    }
}

class A{
    public A(){
        System.out.println("in A");
    }
}

class B extends A{
    public B(){ //constructor name same as class name (constructor)
        System.out.println("in B");
    }

    public B(int n){ //parameterized constructor
        System.out.println("in B in parameter");
    }
}
