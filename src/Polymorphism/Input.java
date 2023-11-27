package Polymorphism;

public class Input implements WebElement{
    @Override
    public void click() {
        System.out.println("Double click to highlight the text");

    }

    @Override
    public String getText() {
        String str = "This text from Input Class...";
        return str;
    }

    @Override
    public void sendKeys(String str) {
        System.out.println("Input Class Key is: " + str);

    }


}
