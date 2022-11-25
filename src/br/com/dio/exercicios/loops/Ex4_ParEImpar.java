package br.com.dio.exercicios.loops;

/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares e a
quantidade de números impares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros; // para somar a quantidade de vezes que o laço se repte.
        int numero; // para salvar o número que está sendo digitado no teclado.
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números");
        quantNumeros = scan.nextInt();

        int count = 0; /* Lembrar que todas vezes que trabalhar com (do / while) é necessario criar um contador para o números de vezes
                        que o laço vai reptir. e inicialo com 0 */
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; //condição para achar números pares e ímpares.
            else quantImpares++;

            count++; // é necessário para controla o laço.

        }while (count < quantNumeros); // contador tem que ser menor que o número de reptição.

        System.out.println("Números Pares: " + quantPares + "\nNumeros Impares: " + quantImpares);
    }
}
