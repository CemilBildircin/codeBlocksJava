package Inheritance;

public class Instagram extends App{

    public Instagram(String name,double version) {
        super(name, version);
    }

    public void postPicture(){
        System.out.println("Posting pictures to Instagram");

    }

    @Override
    public String toString() {
        return "Instagram" +
                "\n\tApplication: " + appName +
                "\n\tUsing Version: " + version;
    }
}
