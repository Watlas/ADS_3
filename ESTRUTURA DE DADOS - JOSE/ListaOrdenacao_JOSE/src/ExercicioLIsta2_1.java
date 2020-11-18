
import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watla
 */
public class ExercicioLIsta2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        //System.out.println("ESCREVA A PALAVRA:");
        String palavra = "abbccççççááááá";// sc.nextLine();
        num = palavra.length();
        int[] aux = new int[num];
        String[] aux2 = new String[num];
        char[] letras = palavra.toCharArray();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                if (palavra.charAt(j) == palavra.charAt(i)) {
                    aux[i]++;
                    aux2[i] = "" + aux[i] + " = " + palavra.charAt(i);
                }
            }
        }
        bolha(aux2);

        for(String n:aux2){
            System.out.println(n);
            
        }
        


    }

    private static void insercao(int[] vet) {

        int i, j, x;
        for (i = 2; i < vet.length; i++) {
            x = vet[i];
            j = i - 1;
            vet[0] = x;
            while (x < vet[j]) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = x;
        }
    }

    private static void bolha(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[i].compareTo(vetor[j]) > 0) {
                    String aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

    }

}
