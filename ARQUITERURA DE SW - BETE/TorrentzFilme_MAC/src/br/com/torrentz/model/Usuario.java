package br.com.torrentz.model;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Random;

public class Usuario {

    private int iden;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private float percentCupom;
    private Date dataGeracaoCupom;

    public static float gerarPercentCupom() {
        DecimalFormat df = new DecimalFormat("0.##");
        float rangeMin = 1;
        float rangeMax = 60;
        Random r = new Random();
        float randomValue = rangeMin + (rangeMax - rangeMin) * r.nextFloat();
        return Float.parseFloat(df.format(randomValue).replace(",", "."));
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getPercentCupom() {
        return percentCupom;
    }

    public void setPercentCupom(float percentCupom) {
        this.percentCupom = percentCupom;
    }

    public Date getDataGeracaoCupom() {
        return dataGeracaoCupom;
    }

    public void setDataGeracaoCupom(Date dataGeracaoCupom) {
        this.dataGeracaoCupom = dataGeracaoCupom;
    }
}
