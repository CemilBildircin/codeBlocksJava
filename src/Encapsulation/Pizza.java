package Encapsulation;
public class Pizza {

    public String size;
    public int topping;
    double pricePizza, grandTotal;

    public Pizza(String size, int topping) {
        setSize(size);
        setTopping(topping);
        CalculatePrice();
    }
    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("Size must be Small - Medium or Large");
        }
    }
    public void setTopping(int topping) {
        if (topping > 0) {
            this.topping = topping;
        } else {
            System.out.println("You have to pick at least one topping");
        }
    }
    public void CalculatePrice() {

        if (size.equalsIgnoreCase("small")) {
            pricePizza = 4;
        } else if ( size.equalsIgnoreCase("medium")){
            pricePizza = 6;
        } else if (size.equalsIgnoreCase("large")){
            pricePizza = 8;
        }
        grandTotal = pricePizza + (topping * 0.75);
    }

    @Override
    public String toString() {
        return "Order Details" +
                "\n\tPizza Size: " + size +
                "\n\tHom Many Topping: " + topping + " ($0.75 per each)" +
                "\n\tPizza Price: $" + pricePizza +
                "\n\tTopping Price: $" + (grandTotal - pricePizza) +
                "\n\tTotal Price: $" + grandTotal;

    }
}
