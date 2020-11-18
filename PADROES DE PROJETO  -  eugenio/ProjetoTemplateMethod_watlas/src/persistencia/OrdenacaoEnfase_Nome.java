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
public class OrdenacaoEnfase_Nome extends OrdenacaoPersistencia {

    public OrdenacaoEnfase_Nome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getNome().equalsIgnoreCase(aluno2.getNome())) {
            return aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0;

        } else {
            return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0;

        }
    }

}
