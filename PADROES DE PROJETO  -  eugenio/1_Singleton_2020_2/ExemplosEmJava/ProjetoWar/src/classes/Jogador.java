/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author eugeniojulio
 */
public class Jogador {
    private String nome = "";
    private Tabuleiro tabuleiro = null;
    
    public Jogador(String nome, Tabuleiro jogo){
        this.nome = nome;
        tabuleiro = jogo;
    }
    
}
