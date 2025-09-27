//another way to print one after another 


public class Threads2 {
    public static void main(String[] args) {
        Runnable obj1 = new L();  //runnable is inside thread class
        Runnable obj2 = () -> 
        {
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);   //lambda expression
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

class L implements Runnable{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

//converting it to lambda expressiom
// class O implements Runnable{
//     public void run(){
//         for(int i=1 ; i<=5 ; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

//re listen 10hrs 55mins to 11:11

//thread safe : only one thread at a time
