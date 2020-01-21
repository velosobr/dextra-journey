package com.company;

public class Carro implements Vehicle {
    private String mdl;
    private int yr;
    private String fl;
    private Motor m;
    private double pr;
    private STATES st;
    private boolean doorOpen = false;

    public Carro(String model, String flag, int year, Motor motor, double price, STATES state) {
        this.mdl = model;
        this.yr = year;
        this.fl = flag;
        this.m = motor;
        this.pr = price;
        this.st = state;
    }

    // get model definition
    public String getMdl() {
        return mdl;
    }

    // set model definition
    public void setMdl(String mdl) {
        this.mdl = mdl;
    }

    // get year definition
    public int getYr() {
        return yr;
    }

    // set year definition
    public void setYr(int yr) {
        this.yr = yr;
    }

    // get flag definition
    public String getFl() {
        return fl;
    }

    // set flag definition
    public void setFl(String fl) {
        this.fl = fl;
    }

    // get motor definition
    public Motor getM() {
        return m;
    }

    // set motor definition
    public void setM(Motor motor) {
        this.m = motor;
    }

    public void calc() {
        int rate;
        rate = 0;
        if (this.st == STATES.A) {
            rate = 2;
        }
        if (this.st == STATES.B) {
            rate = 4;
        }
        if (this.st == STATES.C) {
            rate = 12;
        }
        if (this.m.getPower() >= 200) {
            double tax;
            tax = (float) ((this.yr /2) + this.pr *rate);
            tax = Math.pow(tax, 3);
            System.out.println(tax);
        }
        if (this.m.getPower() < 200) {
            double tax;
            tax = (float) ((this.yr /2) + this.pr *rate);
            tax = Math.pow(tax, 2);
            System.out.println(tax);
        }
    }

    public boolean notShouldPay() {
        if (this.yr - 2019 >= 20)
            return true;
        return false;
    }

    public double price() {
        double p;
        double i;

        p = this.pr;
        i = 0.04 * p;

        return i;
    }

    public void oD() {
        if (this.doorOpen == false)
            this.doorOpen = true;
    }

    public void cD() {
        if (this.doorOpen == true)
            this.doorOpen = false;
    }
}
