package classes;

public abstract class Salario_Funcionario {

    private double saldo;
    private int horas;

    public void somaHorasExtras(double valor, int horas){

        saldo = valor * horas;

    }

    public void DescontoHorasFaltando(double valor, int horas){

        saldo -=valor * horas;

        saldo -=this.taxaPadrao();

    }

    public abstract double taxaPadrao();

    public double getSaldo() {

        return saldo;

    }

}