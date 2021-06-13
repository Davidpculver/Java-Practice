public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name,int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

//    dont need - set to true
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

//    dont need - set to 4
    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
       return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

}
