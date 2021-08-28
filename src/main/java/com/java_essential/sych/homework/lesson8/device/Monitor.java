package com.java_essential.sych.homework.lesson8.device;

import java.util.Objects;

public class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int i, int i1) {
        super(manufacturer, price, serialNumber);
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "manufacturer='" + getManufacturer() + '\''
                + ", price=" + getPrice()
                + ", serialNumber='" + getSerialNumber() + '\''
                + "resolutionX=" + getResolutionX()
                + ", resolutionY=" + getResolutionY()
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return getResolutionX() == monitor.getResolutionX() && getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResolutionX(), getResolutionY());
    }
}

