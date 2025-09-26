//throw : only one exception at a time
//used to explicitly throw a single exception method
//place inside a method or a block of code

public class Throw_Throws_Keyword {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try {
            j=18/i;
            if(j==0){
                //throw new ArithmeticException();  // we are calling catch block here

                //another way to give our own build exception
                throw new UnexpectedException("I want to give my own wxception");

            }
        } 
        // catch (ArithmeticException e) {
        //     j=18/1;  //we are handling the error here
        //     System.out.println("Default output");
        // }

        catch(UnexpectedException e){
            System.out.println(e.getMessage());
            j=18/1;
            System.out.println("default output");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }


        System.out.println(j);
        System.out.println("Heyyyy");
    }
}

//it is my own created
class UnexpectedException extends Exception{
    public UnexpectedException(String str){
        super(str); //to print the content written in parameter of unexpectedexception
    }
}
