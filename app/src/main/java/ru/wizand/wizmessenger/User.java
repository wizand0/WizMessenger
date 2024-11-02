package ru.wizand.wizmessenger;

public class User {

    private String id;
    private String name;
    private String lastName;
    private boolean isOnline;

    public User(String id, String name, String lastName, boolean isOnline) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.isOnline = isOnline;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public User() {
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
