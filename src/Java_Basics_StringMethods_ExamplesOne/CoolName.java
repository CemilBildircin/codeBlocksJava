package Java_Basics_StringMethods_ExamplesOne;

public class CoolName {
    public static void main(String[] args) {

        String coolName = ""; // write your name here...
        String message = "";

        if (coolName.startsWith("a") || coolName.startsWith("z")) {
            message = "Your name is air cool";
        } else if (coolName.endsWith("m")){
            message = "Almost cool";
        } else {
            message = "Sorry not a cool name";
        }
        System.out.println(message);
    }
}