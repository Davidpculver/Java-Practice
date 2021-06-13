public class Camaro extends Car{
    public Camaro(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Camaro -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Camaro -> accelerate()";
    }

    @Override
    public String brake() {
        return "Camaro -> brake()";
    }
}
