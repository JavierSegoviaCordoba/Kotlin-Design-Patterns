import factory.User;
import factory.UserFactory;
import factory.UserType;

public class Main {
    public static void main(String[] args) {
        User normal = UserFactory.getUser(UserType.Normal, "James", "Smith");
        System.out.println(normal.getFullName());
        System.out.println(normal.status());
        System.out.println(String.format("Show ads: %s", normal.showAds()));

        User premium = UserFactory.getUser(UserType.Premium, "Peter", "Brown");
        System.out.println(premium.getFullName());
        System.out.println(premium.status());
        System.out.println(String.format("Show ads: %s", premium.showAds()));
    }
}
