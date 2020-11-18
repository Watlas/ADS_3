
import java.util.Random;
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
public class exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int[] notas = new int[100];
        int nt1=0,nt2=0,nt3=0,nt4=0,nt5=0,nt6=0,nt7=0,nt8=0,nt9=0,nt10=0;
        
        
        for(int i = 0; i <=19; i++){
            System.out.println("COLOQUE A NOTA DO "+(i+1)+"º ALUNO:");
            notas[i] = gerador.nextInt(100);
            if (notas[i] <10) nt1++;
            if (notas[i] >=10 && notas[i]<20) nt2++;
            if (notas[i] >=20 && notas[i]<30) nt3++;
            if (notas[i] >=30 && notas[i]<40) nt4++;
            if (notas[i] >=40 && notas[i]<50) nt5++;
            if (notas[i] >=50 && notas[i]<60) nt6++;
            if (notas[i] >=60 && notas[i]<70) nt7++;
            if (notas[i] >=70 && notas[i]<80) nt8++;
            if (notas[i] >=80 && notas[i]<90) nt9++;
            if (notas[i] == 100) nt10++;
            
            
            
            
            
        }
        System.out.println("alunos com 0 - 9: "+nt1);
        System.out.println("alunos com 10 - 19: "+nt2);
        System.out.println("alunos com 20 - 29: "+nt3);
        System.out.println("alunos com 30 - 39: "+nt4);
        System.out.println("alunos com 40 - 49: "+nt5);
        System.out.println("alunos com 50 - 59: "+nt6);
        System.out.println("alunos com 60 - 69: "+nt7);
        System.out.println("alunos com 70 - 79: "+nt8);
        System.out.println("alunos com 80 - 89: "+nt9);
        System.out.println("alunos com 100zao: "+nt10);
        
        System.out.println("-------------------------------------\n");
        
        for(int i = 0; i <=19; i++){
            System.out.println("NOTAS "+(i+1)+": "+ notas[i]);
        }
        
       
    }
}
