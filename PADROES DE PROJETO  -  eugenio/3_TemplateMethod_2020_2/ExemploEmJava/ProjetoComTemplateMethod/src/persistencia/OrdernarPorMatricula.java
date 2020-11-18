/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Aluno;

/**
 *
 * @author watla
 */
public class OrdernarPorMatricula extends AlunoPersistenciaTemplateMethod {

    public OrdernarPorMatricula(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getMatricula().compareToIgnoreCase(aluno2.getMatricula()) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
