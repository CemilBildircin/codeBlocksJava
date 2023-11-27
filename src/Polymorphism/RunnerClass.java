package Polymorphism;

public class RunnerClass {
    public static void main(String[] args) {


        WebElement myElement = new Input();
        myElement.click();
        System.out.println(myElement.getText());
        myElement.getText();
        myElement.sendKeys("Congrats!!!");
        WebDriverUtil.clickElement(myElement);
        System.out.println("-------");

        WebElement myElement1 = new Link();
        myElement1.click();
        System.out.println(myElement.getText());
        myElement1.sendKeys("You got this!");
        WebDriverUtil.clickElement(myElement1);


    }
}