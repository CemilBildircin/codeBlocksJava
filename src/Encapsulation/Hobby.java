package Encapsulation;

public class Hobby {

    String name;
    int annualCost;
    boolean  isOutdoors, requiresOthers;

    public Hobby(String name){
        this.name=name;
    }
    public Hobby(String name, int annualCost) {
    this(name);
        this.annualCost = annualCost;
    }
    public Hobby(String name, int annualCost, boolean isOutdoors, boolean requiresOthers){
        this(name,annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }
    public void dolt(){
        System.out.println("Name of hobby: " + name);
        System.out.println("It is an outdoor activity: " + isOutdoors);
    }

    @Override
    public String toString() {
        return "\nActivity Detail" +
                "\n\tName: " + name +
                "\n\tAnnual Cost: $" + annualCost +
                "\n\tIs it Outdoor: " + isOutdoors +
                "\n\tRequires Others: " + requiresOthers +
                "\n";
    }
}
