
import java.util.Random;
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {
        
        Random gerador = new Random();

        int V1[] = new int[50];
        int V2[] = new int[50];
        boolean primo = false;

        int cont = 0, N = 0;
         //preenche vetor 1 - 50
        for (int i = 0; i <= 49; i++) {
            System.out.println("Ditite o " + (i + 1) + "º numero: ");
            V1[i] = i + 1;
        }
        //------------------------------------------------------------------

        for (int i = 0; i <= 49; i++) {

            N = V1[i];
            if (N == 1) {
                V2[cont] = i;
                cont++;

            }
            else {

                primo = true;
                for (int j = 2; j < N; j++) {
                    if (N % j == 0) {
                        primo = false;
                    }

                }
                if (primo == true) {

                    V2[cont] = i;
                    cont++;

                }
            }

        }
        int x = 0;
        
       
        for (int i = 0; i < cont; i++) {
            x = V2[i];
            V2[i] = V1[x];
            
        }
      
        
        System.out.println("TODOS OS NUMEROS");
        for (int i = 0; i < 49; i++){
            System.out.print(V1[i] + " - ");
        }
        System.out.println("\n------------ NUMEROS PRIMOS---------------------");
        
         for (int i = 0; i < cont; i++){
            System.out.println(V2[i]);
        }
        
        

    }
}
