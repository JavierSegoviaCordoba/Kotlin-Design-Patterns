package factory.users;

import factory.User;

public class Normal implements User {

    private String name;
    private String surname;

    public Normal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public String status() {
        return "Factory.Normal";
    }

    @Override
    public boolean showAds() {
        return true;
    }
}
