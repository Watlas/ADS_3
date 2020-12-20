package br.com.torrentz.bll;

import br.com.torrentz.dal.*;
import br.com.torrentz.model.*;
import java.util.List;

public class FilmeBll {

    private FilmeDal dal;

    public FilmeBll() throws Exception {
        super();
        dal = new FilmeDal();
    }

    public void create(Filme obj) throws Exception {
        dal.create(obj);
    }

    public List<Filme> read() throws Exception {
        return dal.read();
    }

    public Filme readToID(int iden) throws Exception {
        return dal.readToID(iden);
    }

    public void update(Filme obj) throws Exception {
        dal.update(obj);
    }

    public void delete(Filme obj) throws Exception {
        dal.delete(obj.getIden());
    }

}
