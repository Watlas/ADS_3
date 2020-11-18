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
public class OrdenadoPorSobrenome extends AlunoPersistenciaTemplateMethod {

    public OrdenadoPorSobrenome(String nome) {
        super(nome);
    }
    

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getNome().substring(aluno1.getNome().indexOf(" ") + 1, aluno1.getNome().length())
                .compareToIgnoreCase(aluno2.getNome().substring(aluno2.getNome()
                        .indexOf(" ") + 1, aluno2.getNome().length())) <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
