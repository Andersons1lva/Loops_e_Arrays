package br.com.dio.exercicios.Coletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Dada a lista com 7 notas de um aluno[7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
 */

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(); // Criação da Lista.
        notas.add(7.0); // (.add(7.0) é usado para adicionar algo a lista.) posso usar 7d para o programa entender que é um Double ou 7.0..
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // .indexOf é usado para mostra a posição do elemento.

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // .add(4, 8d) também pode ser usado desta forma passando a posição e o novo valor para adicionar algo a lista
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // .set(notas.indexOf(5d), 6.0) é usado para Substituir um valor dentro da lista. sendo passado a valor antigo e o novo valor
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(9.3)); // .contains(5d) é usado para verificar se um objeto está dentro da lista. 5d é o ojeto a ser verificado.
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); // aqui foi usado o foreach para impresão da lista.

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // .get(2) foi usado para pegar a posição do objeto dentro da lista.
        System.out.println(notas);

        System.out.println("Exibir a menor nota: " + Collections.min(notas)); // Collections.min(notas) foi usado por que não se tem um metodo nativo de Colletion para mostra o menor valor.
        System.out.println(notas);

        System.out.println("Exibir a maior nota: " + Collections.max(notas));
        System.out.println(notas);

        // Estrutura usada para soma objetos de uma lista.
        Iterator<Double> interator = notas.iterator();
        Double soma = 0d;
        while (interator.hasNext()){
            Double next = interator.next();
            soma += next;
        }
        System.out.println("Exibir a soma dos valores: " + soma);

        System.out.println("Exibir a média das notas: " +(soma/notas.size()));

        System.out.println("Remova a nota 0 : ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear(); // .clear(); é usado para apagar toda a lista.
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // .isEmpty(); é usado para verificar se a lista está vazia.
        System.out.println(notas);

    }
}
