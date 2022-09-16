package data.models;

public class Passengers {
    private String name;
    private String phoneNumber;
    private String email;
    private String destination;

    public Passengers(String name, String phoneNumber, String email, String destination) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
