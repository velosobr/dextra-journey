package com.company;

/* const rate = by state;
    int tax = 0;
     if (motor.power >= 200) {
        tax = (year/2 + price*rate)^3
        return tax;
     }
     tax = (year/2 + price*rate)^2
     return tax;

*/


public class Main {


    public static void main(String[] args) {
        Motor v8 = new Motor(200, "Diesel");
        Motor v3 = new Motor(100, "Diesel");

        Carro carro = new Carro("ferrari", "abc-123", 2019, v8, 500000, STATES.A);
        Carro carro2 = new Carro("fox", "abc-321", 2019, v3, 200000, STATES.C);

        Moto m = new Moto("CG 160", "def-456", 2018, v3, 10000, STATES.B);
        Moto m2 = new Moto("Fazer 150", "def-654", 2018, v3, 11000, STATES.A);

        carro.calc();
        carro2.calc();
    }
}
