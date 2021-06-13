public class Mustang extends Car {
    public Mustang(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mustang -> accelerate()";
    }

//    @Override
//    public String brake() {
//        return "Mustang -> brake()";
//    }
}
