
//in non static methods we can use static variables
//static keyword means we are making something class member not a object member
public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Realme";
        obj1.price = 2000;
        obj1.name = "Raghav";   //it also print priya bcs at last name is changed to priya

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 1500;
        obj2.name = "Priya";

        //static variable can be called with classname directly . no need to create object
        //Mobile.name = "Ram";  //correct

        obj1.show();
        obj2.show();


    }
}

class Mobile
{
    String brand;
    int price;
    static String name; //by making this static we are making it common to all
    //any update in name variable reflect to all the places where it is mentioned 

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
