package br.com.dio.exercicios.Metodos;

/**
 * Classe de exemplo para o exercicio da aula 1 de métodos.
 */

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcela){

        if (parcela == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }else if (parcela == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        }else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
