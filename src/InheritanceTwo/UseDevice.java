package InheritanceTwo;

public class UseDevice {

    public static void main(String[] args) {

        Device device1 = new Device();
        device1.brand = "Apple";
        device1.model = "Ipad";
        device1.price = 499.99;
        device1.isWireless = true;
        System.out.println(device1);

        Tv tv1 = new Tv();
        tv1.brand = "LG";
        tv1.model = "LedOled";
        tv1.price = 699.99;
        tv1.isWireless = true;
        System.out.println(tv1);

        Phone phone1 = new Phone();
        phone1.brand = "Apple";
        phone1.model = "Iphone X";
        phone1.price = 399.99;
        phone1.isWireless = true;
        System.out.println(phone1);
    }



}
