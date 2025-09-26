public class Enum2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice()); //Mackbook: 2000
    }
}

enum Laptop{
    Macbook(2000) , XP(2900) , Dell(4000) , ThinkPad(1000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

//annotations
