/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_1;

import java.util.Scanner;

/**
 *
 * @author watla
 */
public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pilha pilha1 = new Pilha();
        int aux;

        for (int i = 1; i <= 10; i++) {
            pilha1.inserir(i);
        }
        System.out.println("QUAL POSIÇÃO DESEJA RETIRAR?");
        aux = Integer.parseInt(ler.nextLine());

        System.out.println("------------------------------\n");

        Pilha outraPilha = new Pilha(pilha1.quantidadeDeElementos());

        while (!pilha1.estaVazia()) {
            int aux2;

            aux2 = pilha1.consultar();
            if (aux2 == aux) {

            } else {
                outraPilha.inserir(aux2);
            }
            System.out.println(outraPilha.consultar());

            pilha1.retirar();
        }

    }

    public static void removerDaPilha(Pilha pilha, int c) {
        Pilha pilha2;
        int aux;
        pilha = new Pilha();

        pilha2 = new Pilha(pilha.quantidadeDeElementos());
        pilha2.estaVazia();

        while (pilha.estaVazia()) {
            aux = pilha.consultar();
            if (aux != c) {
                pilha2.inserir(aux);
            } else {
                break;
            }
        }

    }
}
