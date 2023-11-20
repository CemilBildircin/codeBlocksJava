package Inheritance;

public class App {

    String appName;
    double version;

    public App (String name, double version){
        this.appName = name;
        this.version = version;
    }

    public void download(){
        System.out.println( appName + " " +
                "Downloading version " + version );
    }

    @Override
    public String toString() {
        return "New App" +
                "\n\tApplication: " + appName +
                "\n\tVersion: " + version;
    }
}
