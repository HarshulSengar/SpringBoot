//these are named constants


public class Enums {
    public static void main(String[] args) {
        int i=5;
        Status s = Status.Running;
        System.out.println(s); //running
        System.out.println(s.ordinal());//0 (gives indexing of that status or numbering)

        //all values
        Status [] val = Status.values();
        for(Status p : val){
            System.out.println(p + " : " + p.ordinal());
        }

        //if-else

        Status k = Status.Running;
        if(k==Status.Running){
            System.out.println("All Good");
        }
        else if(k==Status.Failed){
            System.out.println("Error");
        }
        else{
            System.out.println("Please wait");
        }

        //switch
        switch(k){

            //if break is not put all the cases below correct case execute 
            //if break is inserted default does not work
            case Running : System.out.println("All Good");
            break;

            case Pending: System.out.println("Wait a moment");
            break;
            default : System.out.println("Success");
            break;

        }
    }
    
}

enum Status{ // status : classname and enum is a class
    Running , Pending , Succcess ,Failed; //objects
}
