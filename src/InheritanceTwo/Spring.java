package InheritanceTwo;

public class Spring extends Season{
    public Spring(String name, double highAveTemp, double lowAveTemp) {
        super(name, highAveTemp, lowAveTemp);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("Go outside");
    }
}
