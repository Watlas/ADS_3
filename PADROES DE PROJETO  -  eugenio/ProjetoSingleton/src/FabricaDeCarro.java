/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watla
 */
public class FabricaDeCarro {

    private static FabricaDeCarro instance = null;
    private String NomeDaFabrica;
    private String modeloDoCarro;
    private int anoDoCarro;
    private float preço;
    

    public FabricaDeCarro(String Nome) {
        this.NomeDaFabrica = Nome;
        
    }
    
    
    public static FabricaDeCarro getInstancia(String NomeDaFabrica) {
        if (instance == null) {
            instance = new FabricaDeCarro(NomeDaFabrica);
        }
        return instance;
    }

    public String getNomeDaFabrica() {
        return NomeDaFabrica;
    }

    public void setNomeDaFabrica(String NomeDaFabrica) {
        this.NomeDaFabrica = NomeDaFabrica;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    
    

}
