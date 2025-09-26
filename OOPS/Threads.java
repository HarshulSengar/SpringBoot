//we want that N and T function both execute parallely
//every thread must have a run function inside it
//

public class Threads {
    public static void main(String[] args) {
        N obj = new N();
        T obj1 = new T();

        obj.start();  //it is also a function defined in thread to
        obj1.start();

         
    }
}

class N extends Thread{
    public void run(){
        for(int i=0 ; i<=100; i++){
            System.out.println("hi");


            //by using thread.sleep we are able to execute both classes parallely 
            //it is wrapped in try catch bcs tread.sleep gave interrupted exception
            //without this also both functions execute parallely but there are not one after another
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class T extends Thread{
    public void run(){
        for(int i=1 ; i<=100 ; i++){
            System.out.println("hello");

            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
