
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watla
 */
public class exercicio_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n[] = new int[5];
        int aux, c = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "º Numero: ");
            n[i] = ler.nextInt();
            while (n[i] < 10 || n[i] > 100) {
                System.out.println("NUMEROS SOMENTE ENTRE 10 E 100, DIGITE O "
                        + (i + 1) + "numero:");
                n[i] = ler.nextInt();
            }
            aux = n[i];
            c++;
            for (int x = 0; x < c; x++) {
                while (aux == n[i]) {
                    System.out.println("NUMERO DUPLICADO, DIGITE NOVAMente:");
                    n[i] = ler.nextInt();
                }
            }

        }

    }

}
