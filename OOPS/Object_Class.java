//every class in java extends the object class by default


public class Object_Class {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.model = "Hp";
        obj.price = 100000;

        System.out.println(obj); // it will not give data it will give addrress
        //it is by default calling .tostring() method of object class
        System.out.println(obj.toString()); // same output as above

        System.out.println(obj);
    }
}

class Bike{
    String model;
    int price;

    //if we define tostring method it will not print any address it will directly print its value in all obj
    public String toString(){
        return "heyyyyy";
    }
}
