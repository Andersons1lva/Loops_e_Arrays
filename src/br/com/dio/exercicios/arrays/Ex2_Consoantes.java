package br.com.dio.exercicios.arrays;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; // Quando for usar um array para receber do teclado é desta forma que é feita
        int quantidadeConsosantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.nextLine();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){

                consoantes[count] = letra;
                quantidadeConsosantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) { //foreach primeira parte e o tipo  e a segunda o array.
            if (consoante != null) { //
                System.out.println(consoante + " ");
            }
        }
        System.out.println("Quantidade Consosantes: " + quantidadeConsosantes);
    }
}
