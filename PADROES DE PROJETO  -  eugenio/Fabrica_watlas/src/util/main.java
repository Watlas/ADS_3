package util;

import classes.Cafetão;
import classes.Funcionario;
import persistencia.PessoaDal;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Cafetão a = new Cafetão();
        a.setHorasTrabalhadas(2);
        a.setSalario(500);

        try {
            PessoaDal x = new PessoaDal();
           // x.add(a);
            Iterator<Funcionario> lista = x.getAll();
            for (Iterator<Funcionario> it = lista; it.hasNext(); ) {
                Funcionario y = it.next();
                System.out.println(y.getHorasTrabalhadas());


            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
