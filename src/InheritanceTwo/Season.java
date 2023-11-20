package InheritanceTwo;

public class Season {

    String name;
    double highAveTemp;
    double lowAveTemp;

    public Season(String name, double highAveTemp,
                  double lowAveTemp) {
        this.name = name;
        this.highAveTemp = highAveTemp;
        this.lowAveTemp = lowAveTemp;
    }

    public void activity(){

    }

    @Override
    public String toString() {
        return "Season" +
                "\n\tName: " + name +
                "\n\tHigher Average Temperature: "
                + highAveTemp +
                "\n\tLower Average Temperature: "
                + lowAveTemp;
    }
}
