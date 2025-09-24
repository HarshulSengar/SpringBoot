//stack heap
public class Lecture2 {
    public static void main(String[] args) {
        int n1 = 4 , n2 = 5;
        Calculator cal = new Calculator();  //obj
        int res = cal.addition(n1,n2);
        System.out.println(cal.a);//2
        System.out.println(res);
    }
}

class Calculator{    //dont write public class here
    int a=2;//instance variable
    public int addition(int n1 , int n2){
        return n1+n2;
    }
}
