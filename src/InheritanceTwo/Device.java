package InheritanceTwo;

public class Device {

    String brand, model;
    double price;
    boolean isWireless;

    public void useDevice() {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
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
