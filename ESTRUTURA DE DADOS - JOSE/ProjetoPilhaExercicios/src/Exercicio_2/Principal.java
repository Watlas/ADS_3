/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_2;

import java.util.Scanner;

/**
 *
 * @author watla
 */
public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("DIGITE O NUMERO PARA SER CONVERTIDO");
        num = Integer.parseInt(ler.nextLine());

        Pilha pilha1 = new Pilha();

        while (num > 0) {
            int c = num % 2;
            num = num / 2;

            pilha1.inserir(c);

        }

        System.out.println("------------------------------------\n");
        Pilha outraPilha = new Pilha(pilha1.quantidadeDeElementos());

        while (!pilha1.estaVazia()) {
            int aux = pilha1.consultar();
            outraPilha.inserir(aux);
            System.out.print(" "+aux);
            pilha1.retirar();
        }
        System.out.println("");

    }

}
