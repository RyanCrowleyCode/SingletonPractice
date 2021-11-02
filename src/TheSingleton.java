public class TheSingleton {
    private static TheSingleton uniqueInstance;

    private TheSingleton() {}

    public static TheSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new TheSingleton();
        }
        return uniqueInstance;
    }

    public void speak() {
        System.out.println("Yo Dawg, I'm the singleton!");
    }

}
