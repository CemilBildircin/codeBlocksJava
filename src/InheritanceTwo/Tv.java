package InheritanceTwo;

public class Tv extends Device {

    public Tv(){
        super();
    }
    public void App(){
        System.out.println("Watching TV");
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
