import br.com.dio.exercicios.Metodos.Emprestimo;
import br.com.dio.exercicios.Metodos.Calculadora;
import br.com.dio.exercicios.Metodos.Mensagem;
import br.com.dio.exercicios.Sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora");

        Calculadora.soma(2,6);
        Calculadora.subtracao(9,8);
        Calculadora.multiplicacao(5,8);
        Calculadora.divisao(2,43);

        System.out.println("Mensagem");

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(3000, 3);

        System.out.println("Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(2d,4d);
        Quadrilatero.area(3,5,7);
        Quadrilatero.area(3f,6f);
    }
}