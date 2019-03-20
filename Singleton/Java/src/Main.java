public class Main {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.printName();
        user.name = "Peter";
        user.printName();
    }
}