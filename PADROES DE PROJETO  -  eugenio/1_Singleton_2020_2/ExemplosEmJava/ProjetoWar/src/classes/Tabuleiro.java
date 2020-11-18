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
public class Tabuleiro {
    private String identificador = "WAR BÁSICO";
    private static Tabuleiro tabuleiro = null; 
    String getIdentificador(){return identificador;}
    private  Tabuleiro(){}
    
    public static Tabuleiro getTabuleiro(){
        if(tabuleiro == null) tabuleiro = new Tabuleiro();
        return tabuleiro;
    }
}
