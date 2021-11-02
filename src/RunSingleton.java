public class RunSingleton {

    public static void main(String[] args) {
        TheSingleton singleton = TheSingleton.getInstance();
        singleton.speak();
    }
}
