package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0; // contador para o numero de reptições

        do {
            System.out.println("Número: ");
            numero = scan.nextInt(); // Entrada do teclado

            soma = soma + numero; // a soma é igual a soma + número.

            if (numero > maior) maior = numero; // Condição para informar o maior número.


            count = count + 1; // toda vez que ele rodar vai acrescentar mais 1.
        }while (count < 5);   // enquanto o contador for menor que 5 ele vai continuar rodando.

        System.out.println("Maior Número: " + maior);
        System.out.println("Média: " + (soma/5)); // para achar a média. se divide a soma pela quantidade de vezes repetida.


    }

}
