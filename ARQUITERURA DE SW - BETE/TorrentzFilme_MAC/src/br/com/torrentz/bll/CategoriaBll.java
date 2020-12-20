package br.com.torrentz.bll;

import br.com.torrentz.dal.*;
import br.com.torrentz.model.*;
import java.util.List;

public class CategoriaBll {

    private CategoriaDal dal;

    public CategoriaBll() throws Exception {
        super();
        dal = new CategoriaDal();
    }

    public void create(Categoria obj) throws Exception {
        dal.create(obj);
    }

    public List<Categoria> read() throws Exception {
        return dal.read();
    }

    public Categoria readToID(int iden) throws Exception {
        return dal.readToID(iden);
    }

    public void update(Categoria obj) throws Exception {
        dal.update(obj);
    }

    public void delete(Categoria obj) throws Exception {
        dal.delete(obj.getIden());
    }

}
