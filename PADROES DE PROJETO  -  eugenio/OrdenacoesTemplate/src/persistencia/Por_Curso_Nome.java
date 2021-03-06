package persistencia;

import classededados.Aluno;

public class Por_Curso_Nome extends AlunoPersistenciaTemplateMethod {

    public Por_Curso_Nome(String str) {
        super(str);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getCurso().equalsIgnoreCase(aluno2.getCurso())) {
            return aluno1.getNomeSa().compareToIgnoreCase(aluno2.getNomeSa()) <= 0;
        } else {
            return aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0;
        }
    }
}
