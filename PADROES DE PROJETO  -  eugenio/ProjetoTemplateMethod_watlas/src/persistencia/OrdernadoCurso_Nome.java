/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classes.Aluno;

/**
 *
 * @author watla
 */
public class OrdernadoCurso_Nome extends OrdenacaoPersistencia{

    public OrdernadoCurso_Nome(String nome) {
        super(nome);
    }

    @Override
     public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getCurso().equalsIgnoreCase(aluno2.getCurso())) {
            return aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0;

        } else {
            return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0;

        }
    }
    
}
