package br.com.torrentz.bll;

import br.com.torrentz.dal.VisualizacaoDal;
import br.com.torrentz.model.Visualizacao;
import java.util.List;

public class VisualizacaoBll {

    private VisualizacaoDal dal;

    public VisualizacaoBll() throws Exception {
        super();
        dal = new VisualizacaoDal();
    }

    public void create(Visualizacao obj) throws Exception {
        dal.create(obj);
    }

    public List<Visualizacao> read(int vis_fil_iden) throws Exception {
        return dal.read(vis_fil_iden);
    }

    public Visualizacao readToID(int iden) throws Exception {
        return dal.readToID(iden);
    }

    public void update(Visualizacao obj) throws Exception {
        dal.update(obj);
    }

    public void delete(Visualizacao obj) throws Exception {
        dal.delete(obj.getIden());
    }
}
