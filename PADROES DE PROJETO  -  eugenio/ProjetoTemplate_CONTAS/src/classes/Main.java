package classes;



public class Main {

    public static void main(String[] args) {

        Contratado contratado = new Contratado();
        contratado.somaHorasExtras(100.00, 5);
        contratado.DescontoHorasFaltando(50, 2);

        Estagiario estagiario = new Estagiario();
        estagiario.somaHorasExtras(100.00, 4);
        estagiario.DescontoHorasFaltando(50, 2);

        Chefe chefe = new Chefe();
        chefe.somaHorasExtras(5000, 1);
        chefe.DescontoHorasFaltando(0,0);

        System.out.println("Salario do Contratado: " + contratado.getSaldo());

        System.out.println("Salario Do Estagiario: " + estagiario.getSaldo());

        System.out.println("Salario Do EUGENIO: " + chefe.getSaldo());

    }
}