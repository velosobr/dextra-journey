package com.company;

import java.util.Scanner;

import static com.company.Conversao.inverterValor;


public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = teclado.nextInt();
        teclado.nextLine();

        int valorInvertido = inverterValor(valor);

        System.out.printf("O número invertido é: "+ valorInvertido);
    }




}
