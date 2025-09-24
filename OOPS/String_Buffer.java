public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Harsh ");
        System.out.println(sb.capacity()); //21 (by default sb always takes 16 size)
        System.out.println(sb.length());//5

        sb.append("Sengar");
        System.out.println(sb); //harsh sengar

        //sb.toString(); conert to string

        //many more methods u can revise

        //stringbuffer is hread safe and stringbuilder not


    }

    
}
