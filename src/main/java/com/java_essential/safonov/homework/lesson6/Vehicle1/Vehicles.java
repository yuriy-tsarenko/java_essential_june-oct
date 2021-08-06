package com.java_essential.safonov.homework.lesson6.Vehicle1;

public enum Vehicles {

    Vehicles1(10, "BMW"), Vehicles2(10, "Reno"),
    Vehicles3(10, "Mazda"), Vehicles4(10, "Nisan"),
    Vehicles5(10, "Lada");

    private int price;
    private String name;
    private String color = "Red";

    Vehicles(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles { "
                + "price=" + price
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
