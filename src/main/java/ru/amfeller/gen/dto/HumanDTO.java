package ru.amfeller.gen.dto;

import ru.amfeller.gen.entities.Address;

public class HumanDTO {
    private String name;
    private Address address;
    private String birthday;
    private PassportDTO passport;

    public HumanDTO(String name, Address address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public PassportDTO getPassport() {
        return passport;
    }

    public void setPassport(PassportDTO passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "HumanDTO{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", birthday='" + birthday + '\'' +
                ", passport=" + passport +
                '}';
    }
}
