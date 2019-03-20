public class User {
    private static User instance = null;
    public String name = "John";

    private User() {
        System.out.println("Singleton invoked");
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new User();
        }
    }

    public static User getInstance() {
        if (instance == null) createInstance();
        return instance;
    }

    public void printName() {
        System.out.println(name);
    }
}