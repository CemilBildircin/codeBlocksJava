package InheritanceTwo;

public class Fall extends Season{
    public Fall(String name, double highAveTemp,
                double lowAveTemp) {
        super(name, highAveTemp, lowAveTemp);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("Reading a book");
    }
}
