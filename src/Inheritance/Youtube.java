package Inheritance;

public class Youtube extends App {

    public Youtube(String name, double version) {
        super(name, version);
    }

    public void watchVideo(){
        System.out.println
                (" Watching Java tutorials");
    }

    @Override
    public String toString() {
        return "Youtube" +
                "\n\tApplication: " + appName +
                "\n\tVersion " + version;
    }
}
