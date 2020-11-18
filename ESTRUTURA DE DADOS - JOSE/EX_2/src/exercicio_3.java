
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
public class exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int notas[] = new int[20];
        int nt1=0,nt2=0,nt3=0,nt4=0,nt5=0, aux;
        float porce;
        
        for(int i = 0; i <= 19; i++){
            System.out.println("DIGITE A " + (i+1) + "º NOTA.");
            System.out.printf("> ");
            notas[i] = ler.nextInt();
            while(notas[i] <1 || notas[i] >5){
                System.out.println("nota tem que ser <6 e >0, digite novamente: ");
                System.out.printf("> ");
                notas[i] = ler.nextInt();
            }
            if(notas[i] == 1) nt1++;
            if(notas[i] == 2) nt2++;
            if(notas[i] == 3) nt3++;
            if(notas[i] == 4) nt4++;
            if(notas[i] == 5) nt5++;
            
            

        }
        //calculo da porcentagem
        aux = nt5 + nt4;
        porce = (aux * 100)/20;
        
        //imprime na tela
        System.out.println("Quantidade de notas 1: " + nt1);
        System.out.println("Quantidade de notas 2: " + nt2);
        System.out.println("Quantidade de notas 3: " + nt3);
        System.out.println("Quantidade de notas 4: " + nt4);
        System.out.println("Quantidade de notas 5: " + nt5);
        System.out.println("Porcentagem de nota 4 & 5: "+ porce);
        
    }
    
}
