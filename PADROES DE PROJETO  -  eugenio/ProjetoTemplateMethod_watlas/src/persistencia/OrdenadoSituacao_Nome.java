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
public class OrdenadoSituacao_Nome extends OrdenacaoPersistencia{

    public OrdenadoSituacao_Nome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getSituacao().equalsIgnoreCase(aluno2.getSituacao())) {
            return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0;

        } else {
            return aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) <= 0;

        }
    }
    
    
}
