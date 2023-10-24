package Java_Basics_Three;

public class GiftCard {
    public static void main(String[] args) {

        int giftCardBalance = 200, item1Price = 40, item2Price = 100,
                remainingBalance = giftCardBalance - (item1Price + item2Price);
        System.out.println("\nThe gift card started with a balance of $" + giftCardBalance +"." + "\nAfter buying" +
                " first item for $" + item1Price + " and second item for $" + item2Price + "\nthe remaining balance " +
                "of the gift card is $" + remainingBalance + ".");

    }
}
