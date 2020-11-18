/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetowar;
import classes.*;
/**
 *
 * @author eugeniojulio
 */
public class ProjetoWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        //Jogador godofredo = new Jogador("Godofredo das cove",new Tabuleiro());

        //Jogador orozimbo = new Jogador("Orozimbo dos Pepinos", new Tabuleiro());
        
        //Jogador nabuco = new Jogador("Nabuco das Rosas ",new Tabuleiro());
        
        Tabuleiro tab = Tabuleiro.getTabuleiro();
        Jogador godofredo = new Jogador("Godofredo das cove",tab);

        Jogador orozimbo = new Jogador("Orozimbo dos Pepinos", tab);
        
        Tabuleiro tab2 = Tabuleiro.getTabuleiro();
        Jogador nabuco = new Jogador("Nabuco das Rosas ",tab2);
        
        Tabuleiro tab3 = Tabuleiro.getTabuleiro();
        
        
    }
    
}
