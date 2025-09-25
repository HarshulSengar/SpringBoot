public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        Bk obj = new Bk(); 
        Ak obj1 = new Bk();
        Ak obj2 = new Ak();


        //in all these obj.show we dont know which show method we have to call at runtime so it is overide polymorphism
        //this whole method is called dynamic method dispatch as it is dynamic , which method to call we are not sure
        obj.show();//in B show
        obj1.show(); // in B show
        obj2.show();//in A show

        obj2 = new Bk();
        obj2.show(); // in B show

        obj2 = new Ck();
        obj2.show(); //in C show

    }
}

class Ak{
    public void show(){
        System.out.println("in A show");
    }
}

class Bk extends Ak{
    public void show(){
        System.out.println("in B show");
    }
}


class Ck extends Ak{
    public void show(){
        System.out.println("in C show");
    }
}