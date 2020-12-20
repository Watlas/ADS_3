package br.com.torrentz.model;

public class Plano {

    private int iden;
    private String nome;
    private int acessoSimultaneo;
    private float preco;

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public int getAcessoSimultaneo() {
        return acessoSimultaneo;
    }

    public void setAcessoSimultaneo(int acessoSimultaneo) {
        this.acessoSimultaneo = acessoSimultaneo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
