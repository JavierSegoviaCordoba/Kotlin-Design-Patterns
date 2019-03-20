package factory;

import factory.users.Normal;
import factory.users.Premium;

public class UserFactory {
    public static User getUser(UserType userType, String name, String surname) {
        switch (userType) {
            case Normal:
                return new Normal(name, surname);
            case Premium:
                return new Premium(name, surname);
            default:
                return new Normal(name, surname);
        }
    }
}