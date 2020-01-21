package com.company;

public class Motor {
    private int power;
    private String fuel;

    // get power
    public int getPower() {
        return power;
    }

    // set power
    public void setPower(int power) {
        this.power = power;
    }

    // get fuel
    public String getFuel() {
        return fuel;
    }

    // set fuel
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Motor(int power, String fuel) {
        this.power = power;
        this.fuel = fuel;
    }
}
