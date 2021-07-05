import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

//        Car car = new Car("Base", 6);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
        Camaro camaro = new Camaro("z28", 8, "red", true);
//        System.out.println(camaro.startEngine());
//        System.out.println(camaro.accelerate());
//        System.out.println(camaro.brake());
        System.out.println(camaro.color);
//
        Corvette corvette = new Corvette("zl1", 8);
//        System.out.println(corvette.startEngine());
//        System.out.println(corvette.accelerate());
//        System.out.println(corvette.brake());
        System.out.println(corvette.getWheels());
//
//        Mustang mustang = new Mustang("GT500", 8);
//        System.out.println(mustang.startEngine());
//        System.out.println(mustang.accelerate());
//        System.out.println(mustang.brake());



//        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
//        double price = hamburger.itemizeHamburger();
//        hamburger.addHamburgerAddition1("tomato", .50);
//        hamburger.addHamburgerAddition2("lettuce", .75);
//        hamburger.addHamburgerAddition3("cheese", 1.10);
//        System.out.println("Total burger price: " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthAddition1("Lentils", 3.41);
//        System.out.println("Total for your healthy hamburger is: " + healthyBurger.itemizeHamburger());


//From assessment:
//        Mine:
//        public static ArrayList<User> capitalizeRecords(ArrayList<User> users){
//            ArrayList<User> usersCapped = new ArrayList<>();
//            for(int i = 0; i < users.size(); i++){
//                String first = users.get(i).getFirstName();
//                String firstCapped = first.substring(0, 1).toUpperCase(Locale.ROOT) + first.substring(1);
//                String last = users.get(i).getLastName();
//                String lastCapped = last.substring(0, 1).toUpperCase(Locale.ROOT) + last.substring(1);
//                boolean adminOrNot = users.get(i).isAdmin();
//
//                User cappedUser = new User(firstCapped, lastCapped, adminOrNot);
//                usersCapped.add(cappedUser);
//
//                System.out.println(usersCapped.get(i).getFirstName());
//                System.out.println(usersCapped.get(i).getLastName());
//                System.out.println(usersCapped.get(i).isAdmin());
//
//            }
//            return usersCapped;
//        }
//


        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }





    }
}
