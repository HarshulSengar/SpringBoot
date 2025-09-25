public class Wrapper_Class {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num ; // autoboxing : storing primitive type into object automatically

        int num2 = num1 ; // auto-unboxing : storing object into primitive type automatically or manually 

        int num3 = num1.intValue(); //unboxing : by using method storing object into primitive type;

        System.out.println(num2);

        Integer num4 = new Integer(4); // not good practice but we can use it

        String str = "12";
        int n = Integer.parseInt(str); //converts string to integer
        System.out.println(n);


    }
}
