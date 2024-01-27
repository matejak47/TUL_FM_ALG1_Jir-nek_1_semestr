/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author matee
 */
public class ZpracovaniPosloupnosti {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej pocet posloupnosti");
        int pocet = sc.nextInt();
        int[][] posl;
        posl = new int[pocet][];

        for (int i = 0; i < pocet; i++) {
            System.out.println("Zadej pocet hodnot posloupnosti");
            int n = sc.nextInt();
            posl[i] = new int[n];
            for (int j = 0; j < n; j++) {
                posl[i][j] = sc.nextInt();

            }
        }

        int maxruznych = 0;
        int indexPosloupnosti = -1;
        for (int i = 0; i < posl.length; i++) {

            ArrayTools.sort2(posl[i]);
            int ruzne = ArrayTools.pocetRuznychUsp(posl[i]);
            int maxcislo = ArrayTools.maximum(posl[i]);
            
            System.out.println("V " + i + ". posloupnosti je " + ruzne + " ruznych cisel a maximalní číslo je "+ maxcislo);
            
            if (ruzne > maxruznych) {
                maxruznych = ruzne;
                indexPosloupnosti = i;
            }

        }
        System.out.println("Nejvíce je v "+indexPosloupnosti+". posloupnosti ruznych hodnot");
        System.out.println("Posloupnosti po seřezní vypadají takto" + Arrays.deepToString(posl));

    }
}
