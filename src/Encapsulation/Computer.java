package Encapsulation;
public class Computer {
    int price;
    static int screen;
    static int memory;
    static int battery;
    String color;
    static String brand;
    static boolean hasBattery, hasMemory, hasScreen;

    static {
        brand = "Apple";
        hasBattery = true;
        hasMemory = true;
        hasScreen = true;
        screen = 20;
        memory = 256;
        battery = 18;
        ComputerInfo();
    }

    public Computer(int price, String color) {
        this.price = price;
        this.color = color;
    }
    public static void ComputerInfo() {
        System.out.println("Computer Standards");
        System.out.println("Battery Powered: " + hasBattery + " " + battery + " hours");
        System.out.println("Memory : " + hasMemory + " " + memory + "GB");
        System.out.println("Memory : " + hasScreen + " " + screen + " inches");
    }

    @Override
    public String toString() {
        return "\nComputer Detail" +
                "\n\tPrice: $" + price +
                "\n\tColor: " + color;
    }
}
