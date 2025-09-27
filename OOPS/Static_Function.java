

public class Static_Function {
    public static void main(String[] args) {
        Momo obj1 = new Momo();
        obj1.brand = "Realme";
        obj1.price = 2000;
        obj1.name = "Raghav";   

        Momo obj2 = new Momo();
        obj2.brand = "Iphone";
        obj2.price = 1500;
        obj2.name = "Priya";

        //it calls static block only once and contructor twice as constructor is called everytime when u create object
        //sttaic block runs when class load
        //if we does not create any object we still can run static block or load the calss by :
        //Class.forName("Momo");

        //Momo.show(); // error: we cant call a non static method with a class name

        Momo.show1(obj1); //can call sttaic method direactly with calss name


        //we cannot use a non static variable inside a static methid

    }
}

class Momo{
    String brand;
    int price;
    static String name;

    //static block execute only once irrespective how many objects u create
    //and it always execute first whenther it is written at the bottom
    static{
        name = "Phone";
        System.out.println("in static block");
    }
    public Momo(){

        //this is the default data we are giving
        brand = "";
        price=200;
        //name = "Phone"; //we can initialise static variable inside the constructor

        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Momo obj){
        System.out.println("in static method");

        //System.out.println(brand + " : " + price + " : " + name); : error as we cant use non static variable directly inside static block . to call them we have to pass the obj in parameter
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

