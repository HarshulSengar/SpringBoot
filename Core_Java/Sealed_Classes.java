package core_java;
public class Sealed_Classes {
    public static void main(String[] args) {
        
    }
}
//we cannot inherit final class
//sealed permits some of the classes to inherit
//we have to write permit to allow inherit sealed class
//if we want to restrict a class to all subclasses we use sealed

sealed class A permits B,C{

}

non-sealed class B extends A {  //we make it final so no class can inherit class b
    //we have to use 3 keywords to use seled class in it now : final , sealed , non-sealed . any of these
    //if i make it final then no subclass can inherit it . non-sealed means anyone can extend it
    //for interface two option : sealed and non-selaed as interface cant be final

} 

final class C extends A{

}

final class D extends B{

}
 