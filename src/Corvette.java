public class Corvette extends Car {
    public Corvette(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Corvette -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Corvette -> accelerate()";
    }

    @Override
    public String brake() {
        return "Corvette -> brake()";
    }
}
