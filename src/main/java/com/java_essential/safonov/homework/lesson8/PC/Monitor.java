package com.java_essential.safonov.homework.lesson8.PC;

import java.util.Objects;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: "
                + "manufacturer= " + manufacturer
                + ", price= " + price
                + ", serialNumber= " + serialNumber
                + ", X= " + resolutionX
                + ", Y= " + resolutionY;
    }



    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Monitor other = (Monitor) obj;

        if (!Objects.equals(this.resolutionX, other.resolutionX)) {
            return false;
        }

        if (!Objects.equals(this.resolutionY, other.resolutionY)) {
            return false;
        }
        return true;
    }

}
