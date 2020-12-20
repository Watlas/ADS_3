package br.com.torrentz.bll;

import br.com.torrentz.dal.*;
import br.com.torrentz.model.*;
import java.util.List;

public class UsuarioBll {

    private UsuarioDal dal;

    public UsuarioBll() throws Exception {
        super();
        dal = new UsuarioDal();
    }

    public void create(Usuario obj) throws Exception {

        try {
            dal.create(obj);
        } catch (Exception e) {

            String mensagem = e.getMessage();

            if (mensagem.contains(
                    "duplicate key value violates unique constraint \"usuarios_usu_cpf_key\"")) {
                mensagem = "Esse CPF já está cadastrado";
            }
            throw new Exception(mensagem);
        }
    }

    public List<Usuario> read() throws Exception {
        try {
            return dal.read();

        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario readToID(int iden) throws Exception {
        try {
            return dal.readToID(iden);
        } catch (Exception e) {
            throw e;
        }
    }

    public void update(Usuario obj) throws Exception {
        try {
            dal.update(obj);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Usuario obj) throws Exception {
        try {
            dal.delete(obj.getIden());
        } catch (Exception e) {
            throw e;
        }
    }
}
