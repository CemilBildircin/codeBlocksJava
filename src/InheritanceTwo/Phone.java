package InheritanceTwo;

public class Phone extends Device {
    public Phone(){
        super();
    }
    public void App(){
        System.out.println("Using phone");
    }

    @Override
    public String toString() {
        return "Device Details" +
                "\n\tBrand: " + brand +
                "\n\tModel: " + model +
                "\n\tPrice: $" + price +
                "\n\tWireless: " + isWireless;
    }

}
