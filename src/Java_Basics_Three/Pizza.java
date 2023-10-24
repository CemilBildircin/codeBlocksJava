package Java_Basics_Three;

public class Pizza {
    public static void main(String[] args) {

        String pizza = "cheese";
        byte pizzaSlice = 8, people = 4;
        int slicePerPerson = pizzaSlice / people;
        System.out.println("\nWe ordered " + pizza + " pizza" + " with " + pizzaSlice + " slices, "
                + people + " people " + slicePerPerson + " slices each. \nWe are all still hungry. ");

    }
}
