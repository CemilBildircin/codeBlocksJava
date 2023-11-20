package Encapsulation;

public class CallDebitCard {
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard("visa", 1233,"Caglar",
                1234567890123456L,9999);
        System.out.println(card1);
    }
}
