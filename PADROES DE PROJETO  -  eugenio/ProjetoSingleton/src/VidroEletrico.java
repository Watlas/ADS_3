/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watla
 */
public class VidroEletrico extends FabricaDeCarro{

    private FabricaDeCarro nome;

    public VidroEletrico(FabricaDeCarro nome, String Nome) {
        super(Nome);
        this.nome = nome;
    }
    
    
    
    private float preco = 200;
    
    public String getmarca(){
        return "SEM VIDRO ELETRICO";
    }
    
    public float getpreco(){
        return preco;
        
    }
    
    

}