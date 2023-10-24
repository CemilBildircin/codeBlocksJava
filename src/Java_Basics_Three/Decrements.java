package Java_Basics_Three;

public class Decrements {
    public static void main (String[] args){

        byte cars = 10;
        System.out.println("\nThere are " + cars + " in the parking lot.");
        System.out.print("Two more cars in the parking lot: " ); ++cars; ++cars;
        System.out.println(cars + " cars in the parking lot.");
        System.out.print("Four cars left the parking lot: "); --cars; --cars; --cars; --cars;
        System.out.println(cars + " cars in the parking lot.");
        System.out.print("Five cars left the parking lot: " ); --cars; --cars; --cars; --cars;--cars;
        System.out.print(cars + " cars in the parking lot.\n\n");



    }
}
