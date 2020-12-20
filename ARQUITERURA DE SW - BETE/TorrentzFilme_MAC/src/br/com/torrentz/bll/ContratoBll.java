package br.com.torrentz.bll;

import br.com.torrentz.dal.ContratoDal;
import br.com.torrentz.model.Contrato;
import java.util.List;

public class ContratoBll {

    private ContratoDal dal;

    public ContratoBll() throws Exception {
        super();
        dal = new ContratoDal();
    }

    public void create(Contrato obj) throws Exception {
        dal.create(obj);
    }

    public List<Contrato> read(int con_usu_iden) throws Exception {
        return dal.read(con_usu_iden);
    }

    public Contrato readToID(int iden) throws Exception {
        return dal.readToID(iden);
    }

    public void update(Contrato obj) throws Exception {
        dal.update(obj);
    }

    public void delete(Contrato obj) throws Exception {
        dal.delete(obj.getIden());
    }

}
