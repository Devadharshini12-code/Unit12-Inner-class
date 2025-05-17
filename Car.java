// Regular inner class
public class Car {
    private String model = "Sedan";

    class Engine {
        void start() {
            System.out.println(model + " engine started.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();  // create inner class object
        engine.start();
    }
}
