package Polymorphism;

public class Link implements WebElement {
    @Override
    public void click() {
        System.out.println("This text from Link Class...");
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void sendKeys(String str) {
        System.out.println("Link Class key is: " + str);

    }

}
