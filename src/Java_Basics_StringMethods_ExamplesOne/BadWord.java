package Java_Basics_StringMethods_ExamplesOne;

public class BadWord {
    public static void main(String[] args) {

        String str = ""; // write your message here...we can use scanner method for any message.
        String message = "";

        if (str.contains("idiot") || str.contains("dumb") || str.contains("heck")){
            message = "Message not sent";
        } else {
            message = "Message sent";
        }
        System.out.println(message);
    }
}
