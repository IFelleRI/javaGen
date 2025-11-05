package ru.amfeller.gen.entities;

public class Human {
    public Integer id;
    private String name;
    private Address address;
    private String birthday;
    private String passport;

    public Human(String name, Address address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
