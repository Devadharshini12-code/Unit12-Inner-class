// Static nested class
public class Car1 {
    static class Dashboard {
        static void showInfo() {
            System.out.println("Showing dashboard info...");
        }
    }

    public static void main(String[] args) {
        Car1.Dashboard.showInfo();  // directly call without outer object
    }
}