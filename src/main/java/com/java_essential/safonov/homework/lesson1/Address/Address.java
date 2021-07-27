package com.java_essential.safonov.homework.lesson1.Address;

public class Address {
    String index;
    String country;
    String city;
    String street;
    String house;
    String apartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{"
                + "index='" + index + '\''
                + ", country='" + country + '\''
                + ", city='" + city + '\''
                + ", street='" + street + '\''
                + ", house='" + house + '\''
                + ", apartment='" + apartment + '\''
                + '}';
    }
}
