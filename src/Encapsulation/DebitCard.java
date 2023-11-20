package Encapsulation;

public class DebitCard {

    long cardNumber; String holderName, cardType; int pin;
    double balance; static String accountType;

    static {
        accountType = "Hells Fargo Debit Account";
        System.out.println(accountType);
            }
    public DebitCard(long cardNumber) {
        String str = "" + cardNumber;
        if (str.length() == 16) {
            this.cardNumber = cardNumber;
        } else System.out.println("Invalid Card Number");
    }
    public DebitCard(String cardType, int pin, String holderName, long cardNumber, double balance) {
        this(cardNumber);
        if (cardType.equalsIgnoreCase("MasterCard") ||
                  cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        } else System.out.println("Invalid Card Type");

        String strPin = "" + pin;
        if (strPin.length() == 4) {
            this.pin = pin;
        } else System.out.println("Invalid Pin Length");
        this.holderName = holderName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Your Account Details" +
                "\n\tCard Number: " + cardNumber +
                "\n\tHolder Name: " + holderName +
                "\n\tCard Type: " + cardType +
                "\n\tBalance: " + balance;
    }
}
