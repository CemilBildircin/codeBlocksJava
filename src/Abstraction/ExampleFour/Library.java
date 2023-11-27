package Abstraction.ExampleFour;

public class Library {
    public static void main(String[] args) {


        JavaTextbook tb1 = new JavaTextbook();
        tb1.name = "Java for Geniuses";
        tb1.size = 250.9;
        tb1.isFun = true;
        System.out.println(tb1);
        tb1.download();
        tb1.open();
        tb1.read();




    }
}
