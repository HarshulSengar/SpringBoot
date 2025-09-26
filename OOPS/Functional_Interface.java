// lambda expression
//we can use lambda expression only with functional interfaces




public class Functional_Interface {
    public static void main(String[] args) {

        //lambda expression way
        M obj = (i)->
        {
            //as there is only statement we can skip {}
            //we can write this in anonymous and inside another class also 
            System.out.println("in show");

        };

        //M obj = i -> System.out.println("in show"); : shortest way
        obj.show(5);
    }
}

@FunctionalInterface //by using this annotation if i define two functions it eill give error
interface M{
    void show(int i);
}
