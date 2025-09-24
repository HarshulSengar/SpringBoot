class data{
    private int age = 10; //now to access them have to use getter and setter methods
    private String name = "Harsh";

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        data obj = new data();
        obj.setAge(18);
        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}


