package persistencia;

import classededados.Aluno;

public class Por_Enfase_Nome extends AlunoPersistenciaTemplateMethod {

    public Por_Enfase_Nome(String str) {
        super(str);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getEnfase().equalsIgnoreCase(aluno2.getEnfase())) {
            return aluno1.getNomeSa().compareToIgnoreCase(aluno2.getNomeSa()) <= 0;
        } else {
            return aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0;
        }
    }
}
