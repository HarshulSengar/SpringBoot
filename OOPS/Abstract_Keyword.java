//abstaract method only belong to abstract class
//if we only have to initialise a method not to define it we use abstract

//abstract class must have abstract method : not compulsary

abstract class Car{
    public abstract void drive(); // only initialising it
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }

}

abstract class WagonR extends Car{ //if does not implement drive method in it it will give error
    //compulsary to define abstract methods in this function

    //if we don want to implement all abstract methods inside it we make this class also abstract
    public void drive(){
        System.out.println("Driving..");
    }
}

class UpdatedWagon extends WagonR{ //concrete class

    public void fly(){
        System.out.println("Flying..");
    }
}

public class Abstract_Keyword {
    public static void main(String[] args) {
        //Car obj = new Car; // wrong : we can't create object of abstract class
        //we can create refrence of abstract class

        //Car obj = new WagonR();

        Car obj = new UpdatedWagon(); // which has implementation of all methods
        obj.drive();
        obj.playMusic();


    }
}
