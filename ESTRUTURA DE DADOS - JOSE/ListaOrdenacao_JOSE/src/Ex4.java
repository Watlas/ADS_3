
import java.util.Arrays;
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
public class Ex4 {

    public static void main(String[] args) {

        int vetorX[] = {1,2,3,4};
        int vetorY[] = {5,6,7,8};
        int vetorN[] = new int[vetorX.length + vetorY.length];
        int x = 0;
        int y = 0;
        int n = 0;

        while (x < vetorX.length && y < vetorY.length) {
            if (vetorX[x] < vetorY[y]) {
                vetorN[n] = vetorX[x];
                x++;
                n++;
            } else {
                vetorN[n] = vetorY[y];
                y++;
                n++;
            }
        }

        if (x == vetorX.length) {
            //Todos do conjunto X foram atribuídos
            while (y < vetorY.length) {
                vetorN[n] = vetorY[y];
                y++;
                n++;
            }
        } else {
            //Todos do conjunto Y foram atribuídos
            while (x < vetorX.length) {
                vetorN[n] = vetorX[x];
                x++;
                n++;
            }
            
        }
        System.out.println("Elementos Intercalados");
        for (int i=0;i<vetorN.length;i++){
            System.out.print(vetorN[i]+" ");
        }
    }
}

