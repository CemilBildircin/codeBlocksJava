package Java_Basics_One;

public class ConcatenationExampleThree {
    public static void main(String [] args) {

        String brand = "HP";
        String processor = "Intel(R) Core(TM) i7-8650U ";
        String ramMemory = "16 GB";
        String storageMemory = "1 TB";
        boolean hasMonitor = true;
        boolean hasWifi = true;
        String description = "64-bit operating system, x64-based processor." + "\n\t\t\t\t\t" +
                "Pen and touch Pen and touch support with 10 touch points";
        int price = 1499;
        String cpu = "1.90GHz";
        String color = "Gray";
        byte numberOfMonitors = 2;
        byte numberOfUsbSlots = 4;
        boolean hasUsb3_0 = true;
        System.out.println("Computer Details: \n" + "\t" + "Brand:" + "\t\t\t" + brand + "\n\t" + "Processor:" + "\t\t" + processor + "\n\t" +
                "Ram Memory:" + "\t\t" + ramMemory + "\n\t" + "Mem. Capacity:" + "\t" + storageMemory + "\n\t" + "Monitor:"
                + "\t\t" + hasMonitor + "\n\t" + "Number Of Monitors:" + "\t" + numberOfMonitors + "\n\t"
                + "WiFi:" + "\t\t\t" + hasWifi + "\n\t" + "CPU:" + "\t\t\t" + cpu + "\n\t" + "USB Slots:" + "\t\t" + numberOfUsbSlots + "\n\t" +
                "USB 3.0:" + "\t\t" + hasUsb3_0 + "\n\t" + "Color:" + "\t\t\t" + color + "\n\t" + "Price:" + "\t\t\t" + "$" + price +
                "\n\t" + "Detail:" + "\t\t\t" + description );

    }
}
