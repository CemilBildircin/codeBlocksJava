package Java_Basics_StringMethods_ExamplesOne;

public class SMSPart {
    public static void main(String[] args) {

        String sender = "<Speedy Gonzalez>"; //17
        String num = "[202-456-3456]"; //14
        String message = "{I love programing and solving problems}";//40
        System.out.println(
                "Sender: " + sender.substring(1, sender.length()-1) + "\nNumber: " + num.substring(1,num.length()-1)
                        + "\nMessage: " + message.substring(1, message.length()-1));
    }
}
