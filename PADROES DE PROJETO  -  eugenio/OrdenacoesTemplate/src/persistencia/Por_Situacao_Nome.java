package persistencia;

import classededados.Aluno;

public class Por_Situacao_Nome extends AlunoPersistenciaTemplateMethod {

    public Por_Situacao_Nome(String str) {
        super(str);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getSituacao().equalsIgnoreCase(aluno2.getSituacao())) {
            return aluno1.getNomeSa().compareToIgnoreCase(aluno2.getNomeSa()) <= 0;
        } else {
            return aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) <= 0;
        }
    }
}
