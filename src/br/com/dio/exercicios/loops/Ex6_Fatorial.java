package br.com.dio.exercicios.loops;

/*
Faça um programa que calcule o Fatorial de um número inteiro fornecido pelo usuario.
Ex.: 5! = 120
 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }

}
