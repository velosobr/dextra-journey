package com.company;

public class Conversao {

    /**
     *  Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
     *  e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
     *  e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do
     *  país B, mantidas as taxas de crescimento.
     *
     */
    public int calcularAnosNecessarios(int populacaoA, double taxaAnualA, int populacaoB, double taxaAnualB){
        int qtdAnos = 0;

        for(int i = 0; i <)
        return qtdAnos;

    }

    /**
     * Faça uma função que inverta um número inteiro informado. Por exemplo: 127 -> 721
     */
    public static int inverterValor(int valor) {
        int valorInvertido = 0;
        while (valor > 0) {
            valorInvertido *= 10;
            valorInvertido +=  (valor % 10);
            valor /= 10;
        }
        return valorInvertido;
    }
}
