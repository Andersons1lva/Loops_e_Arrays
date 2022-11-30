import br.com.dio.exercicios.Metodos.Ex1_Metodos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora");
        Ex1_Metodos calculadora = new Ex1_Metodos();

        calculadora.soma(2,6);
        calculadora.subtracao(9,8);
        calculadora.multiplicacao(5,8);
        calculadora.divisao(2,43);
    }
}