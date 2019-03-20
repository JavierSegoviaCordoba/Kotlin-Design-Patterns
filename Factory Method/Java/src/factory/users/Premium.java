package factory.users;

import factory.User;

public class Premium implements User {

    private String name;
    private String surname;

    public Premium(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public String status() {
        return "Factory.Premium";
    }

    @Override
    public boolean showAds() {
        return false;
    }
}

