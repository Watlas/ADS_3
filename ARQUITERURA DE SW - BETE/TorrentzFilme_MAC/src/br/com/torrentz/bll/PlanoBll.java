/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torrentz.bll;

import java.util.List;
import br.com.torrentz.model.Plano;
import br.com.torrentz.dal.PlanoDal;

/**
 *
 * @author Crok
 */
public class PlanoBll {
    
    private PlanoDal dal;

    public PlanoBll() throws Exception {
        super();
        dal = new PlanoDal();
    }

    public void create(Plano obj) throws Exception {
        dal.create(obj);
    }

    public List<Plano> read() throws Exception {
        return dal.read();
    }

    public Plano readToID(int iden) throws Exception {
        return dal.readToID(iden);
    }

    public void update(Plano obj) throws Exception {
        dal.update(obj);
    }

    public void delete(Plano obj) throws Exception {
        dal.delete(obj.getIden());
    }
}
