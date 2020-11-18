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
public class OrdenadoEnfase_Curso_Nome extends OrdenacaoPersistencia{

    public OrdenadoEnfase_Curso_Nome(String nome) {
        super(nome);
    }

    @Override
       public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getEnfase().equalsIgnoreCase(aluno2.getEnfase())) {
            if (aluno1.getCurso().equalsIgnoreCase(aluno2.getCurso())) {
                return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0;
            } else {
                return aluno1.getCurso().compareToIgnoreCase(aluno2.getNome()) <= 0;

            }
        } else {
            return aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0;

        }
    }
    
}
