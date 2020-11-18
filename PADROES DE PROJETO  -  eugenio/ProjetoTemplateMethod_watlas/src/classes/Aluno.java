/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author watla
 */
public class Aluno {

    private String nome;
    private String curso;
    private String situacao;
    private String enfase;

    public Aluno() {
    }

    public Aluno(String nome, String curso, String situacao, String enfase) {
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
    }
      public Aluno(String str){
        String[] vetor = str.split(";");
        this.nome = vetor[0];
        this.enfase = vetor[1];
        this.situacao = vetor[2];
        this.curso = vetor[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }
   

}
