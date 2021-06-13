public class Main {

    public static void main(String[] args) {
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("David", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();
//        System.out.println(bedroom.getWall1().getDirection());

        Car car = new Car("Base", 6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Camaro camaro = new Camaro("z28", 8);
        System.out.println(camaro.startEngine());
        System.out.println(camaro.accelerate());
        System.out.println(camaro.brake());

        Corvette corvette = new Corvette("zl1", 8);
        System.out.println(corvette.startEngine());
        System.out.println(corvette.accelerate());
        System.out.println(corvette.brake());

        Mustang mustang = new Mustang("GT500", 8);
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());

    }
}
