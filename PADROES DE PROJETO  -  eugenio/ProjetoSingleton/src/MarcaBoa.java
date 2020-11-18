/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watla
 */
public class MarcaBoa extends VidroEletrico{
    
    private VidroEletrico c;

    public MarcaBoa(VidroEletrico c) {
        this.c = c;
    }


    public float getpreco(float aux) {
        aux=200;
        return aux + c.getpreco();
        
    }
    
}
