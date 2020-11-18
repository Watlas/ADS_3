/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author watla
 */
public class TecnicoTi extends Funcionarios {

    Funcionarios funcionario;
    int horasTrabalhadas;

    TecnicoTi() {

    }

    public TecnicoTi(Funcionarios c) {
        this.funcionario = c;
      
    }
 

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public TecnicoTi(Funcionarios tecnico, int horasTrabalhadas) {
        this.funcionario = tecnico;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double ajuste() {
        
          //double ajus = aux * 100;

        return funcionario.ajuste() + 100;
     

    }

}
