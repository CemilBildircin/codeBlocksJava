package InheritanceTwo;

public class Winter extends Season {

    public Winter(String name, double highAveTemp,
                  double lowAveTemp) {
        super(name, highAveTemp, lowAveTemp);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("Enjoy the fireplace");
    }
}
