package core_java;

public class Record_Classes {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Raghav");
        System.out.println(a1); //by tostring method for long method and print directly for record
        //Alien a2 = new Alien(); //gave error for record as we initialise two parameters
        //there is no default constructor inseide record

    }
}

// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name){ 
//         this.id=id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     //we generate it to get direct values
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Alien{");
//         sb.append("id=").append(id);
//         sb.append(", name=").append(name);
//         sb.append('}');
//         return sb.toString();
//     }

    

    
// }


//in place of all of this we can make record class

record Alien(int id , String ans){}

//alll variabls in record are final and private
//it cannot xtend any other class
//record cls extend only record class

//from 13.03 hrs