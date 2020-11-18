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
public class Operador extends Funcionarios {

    private Funcionarios funcionario;
    int horasTrabalhadas;
    // int salario;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Operador(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

 @Override
    public double ajuste() {
        
        //double ajus = aux * 200;

        return funcionario.ajuste()+ 200;

    }

}
