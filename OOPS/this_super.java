//everytime we make the obj constructor is called
//when we create object it call constructor of subclass and supercalss both
//every constructor should have super which calls the super class constructor by default
//every class in java extends object class whether we mention it or not
//this will execute constructor of same class

public class this_super {
    public static void main(String[] args) {
        Bm obj = new Bm();
        Bm obj1 = new Bm(90); 
    }
}

class At{
    public At(){
        super(); //whether we write it or not it is always there
        System.out.println("in A");
    }
    public At(int n){
        super();
        System.out.println("in A in parameter");
    }
}

class Bm extends At{
    public Bm(){ //constructor name same as class name (constructor)
        super();
        System.out.println("in B");
    }

    public Bm(int n){ //parameterized constructor
        this(); //it will call both constructor of B class
        //super(n); // if we dont write n in bracket it will call default constructorof A not parameterised
        System.out.println("in B in parameter");
    }
}




//Anonymous object
