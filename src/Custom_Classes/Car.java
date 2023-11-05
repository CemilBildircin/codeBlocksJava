package Custom_Classes;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    @Override
    public String toString() {
        return "Car" +
                "\nmodel: '" + model +
                "\nyear: " + year +
                "\ncolor: '" + color +
                "\nfuelLevel: " + fuelLevel;
    }

    public void drive() {
        System.out.println("Driving: " + model +
                "\nFuel level is: " + (fuelLevel - 5) + " Gallon");
    }

    public void fillTank() {
        fuelLevel = 100;
        System.out.println("Filling the tank..."
                + "\nFuel level now is: " + fuelLevel + " Lezzz Go");
    }

    public boolean isLow() {
        if (fuelLevel < 25) {
            return true;
        } else {
            return false;
        }
    }
}
