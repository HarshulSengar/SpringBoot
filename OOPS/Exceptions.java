//three type error: compile-time , runtime(exception handling) , logicall error


public class Exceptions {
    public static void main(String[] args) {
        int i=4;
        int j=0;
        //it will not gabve any error it will execute catch block

        try {
            j = 18/j;
            //if error is found in try block it will not execute below lines or code 
            System.out.println("hey");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot divide by zero");
        }

        //we cannot put this catch block at first bcs it handle all exception then what is the need of other catch . it is parents class
        catch (Exception e) {
            System.out.println("Something went wrong  " + e);
        }

        //finally always execute
        finally{
            System.out.println("Always execute");
        } 
        System.out.println("Bye");
    }
}


// on top object class -> then throwable -> error , exception
// runtime exception : unchecked exceptions as it is a choice whether we want to handle them or not
// sql or io exception : checked exception : compulsary to handle the exception
