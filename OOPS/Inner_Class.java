//we cant make outer class Ap static we only make inner class static

class Ap{
    int age;

    public void show(){
        System.out.println("in show");
    }

    class Bp{
        public void config(){
            System.out.println("in config");
        }
    }

    //if we made a class static we dont need to create its object
    static class Cp{
        public void stat(){
            System.out.println("in stat");
        }
    }
}




public class Inner_Class {
    public static void main(String[] args) {
        Ap obj = new Ap();
        obj.show();
        //obj.config(); : error

        Ap.Bp obj1 = obj.new Bp(); //way to define
        //to create obj of b we need to create object of A
        obj1.config();



        Ap.Cp obj2 = new Ap.Cp();//static class
        obj2.stat();


    }

}
