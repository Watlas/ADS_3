/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_2;
/**
 *
 * @author watla
 */
public class Pilha {

    private int tamanho;
    private int[] Array;
    private int topo = -1;

    public Pilha() {
        this(10);

    }

    public Pilha(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("tamanho nao pode ser menor que 10");
        }

        this.tamanho = tamanho;
        Array = new int[tamanho];
    }

    public void inserir(int elemento) {
        if (estaCheia()) {
            throw new RuntimeException("esta cheio");
        }

        Array[topo + 1] = elemento;
        topo++;
    }

    public void retirar() {
        if (estaVazia()) {
            throw new RuntimeException("esta vazio");
        }

        topo--;
    }

    public boolean estaVazia() {
        return topo == -1;

    }

    public boolean estaCheia() {
        return topo == (tamanho - 1);

    }

    public int quantidadeDeElementos() {
        return topo+1;

    }
    public int consultar(){
        return Array[topo];
    }
    public void esvaziarPilha(){
        topo =-1;
    }
    





}
