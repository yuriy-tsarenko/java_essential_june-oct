package com.java_essential.sych.homework.lesson8.device;

public class EthernetAdapter extends Device{

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{"
                + "speed=" + speed
                + ", mac='" + mac + '\''
                + '}';
    }


}
