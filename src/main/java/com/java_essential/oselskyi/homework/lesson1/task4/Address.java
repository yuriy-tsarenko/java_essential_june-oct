package com.java_essential.oselskyi.homework.lesson1.task4;

/**
 * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Address.
 * В теле класса требуется создать поля: index, country, city, street, house, apartment.
 * Для каждого поля, создать метод с двумя методами доступа (get, set) Создать экземпляр класса Address.
 * В поля экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.
 */
public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private int appartment;


    public static void main(String[] args) {

        Address address = new Address();
        address.setAppartment(45);
        address.setCity("Киев");
        address.setCountry("Украина");
        address.setHouse("23В");
        address.setIndex(1234123);
        address.setStreet("Глазунова");
        System.out.println(address.toString());
    }


    @Override
    public String toString() {
        return "Address:" + "\n"
                + "{ индекс = " + index + " }" + '\n'
                + "{ страна = " + country + " }" + '\n'
                + "{ город = " + city + " }" + '\n'
                + "{ улица = " + street + " }" + '\n'
                + "{ дом = " + house + " }" + '\n'
                + "{ квартира = " + appartment + " }";
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
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

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }
}
