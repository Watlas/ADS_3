/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_shell_sort;

/**
 *
 * @author watla
 */
public class METODO_SHELL_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int x[] = {65, 75, 6, 57, 99, 27,0 ,96,95,74,12};  
        shellsort(x);
    }
    public static void shellsort(int x[]){
        int i , j, aux, h;                                             //variaves
        h = x.length / 2;                                             
        System.out.print("Valor de h: "+ h +" Vetor: ");
        for(i = 0; i < x.length; i++ ){
            System.out.print(x[i] + " ");
        }
        System.out.println("");
        while (h > 0){
            for (i = h; i< x.length; i++){//4
                aux = x[i];
                for(j = i - h; ((j >=0) && (x[j] > aux)); j = j - h){ //99  -  65
                    x[j + h] = x[j];
                }
                x[j + h] = aux;
            }
            h /= 2;
           
            System.out.print("Valor de h: " + h + " Vetor: " );
            for(i = 0; i < x.length; i++){
                System.out.print(x[i] + " ");
            }
            System.out.println("");
        }
    }
    
    
}
