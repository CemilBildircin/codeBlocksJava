package InheritanceTwo;

public class Summer extends Season{
    public Summer(String name, double highAveTemp, double lowAveTemp) {
        super(name, highAveTemp, lowAveTemp);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("Drink lemonade");
    }
}
