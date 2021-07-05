public class Camaro extends Car{

    public String color;
    public Boolean ttops;

    public Camaro(String name, int cylinders) {
        super(name, cylinders);
    }

    public Camaro (String name, int cylinders, String color, Boolean ttops){
        super(name, cylinders);
        this.color = color;
        this.ttops = ttops;
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
