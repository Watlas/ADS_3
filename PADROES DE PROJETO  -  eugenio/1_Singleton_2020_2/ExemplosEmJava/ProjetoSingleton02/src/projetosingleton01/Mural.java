/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosingleton01;

/**
 *
 * @author eugenio
 */
public class Mural {
    //Atributos
    //instancia unica - controlador
    private static Mural muralGeral = null; 
    private String titulo;
    private String texto;
    // Metodos
    // Metodo estatico para obter instancia da classe

    public static Mural getMural(String titulo){
        if(muralGeral == null){
            muralGeral = new Mural(titulo);
        }
        return muralGeral;
    }
    // Construtor Privado
    private Mural (String titulo){
        this.titulo = titulo;
        texto = titulo + "\n";
    }
    public String getTitulo(){ return titulo;}
    public String getTexto(){ return texto;}
    public void setTexto(String texto){ this.texto += texto + "\n";}
}
