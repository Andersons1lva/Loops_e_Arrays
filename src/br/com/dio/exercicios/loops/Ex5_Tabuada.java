package br.com.dio.exercicios.loops;

/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
o úsuario de informar de qual número ele deseja ver a tabuada.
a saída deve ser conforme o exemplo abaixo:

Tabuada de 5:

5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        // Estrutura do for e dividida em 3 partes a 1 e um contador, a 2 o limite e a 3 a parada.
        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
