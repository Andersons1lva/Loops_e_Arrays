package br.com.dio.exercicios.Metodos;

public class Ex1_Metodos {

    public static void soma(int numero1, int numero2){
        double resultado = numero1 + numero2;

        System.out.println("A Soma de: " + numero1 + " Mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(int numero1, int numero2){

       double resultado = numero1 - numero2;
        System.out.println("A Subtração de: " + numero1 + " Menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(int numero1, int numero2){
        double resultado = numero1 * numero2;
        System.out.println("A Multiplicação de: " + numero1 + " X " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A Divisão de: " + numero1 + " / " + numero2 + " é " + resultado);
    }
}
