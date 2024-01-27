/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;

/**
 *
 * @author matee
 */
public class PiskvorkyTest {

    private static final Scanner sc = new Scanner(System.in);
    private static int[][] mt = {
        {0, 0, 0, 1, 0, 1, 1},
        {2, 2, 0, 1, 0, 1, 2},
        {0, 2, 0, 1, 1, 2, 1},
        {0, 2, 2, 1, 2, 0, 1},
        {0, 2, 2, 2, 1, 0, 1},
        {0, 0, 0, 1, 2, 0, 1},
        {0, 0, 1, 1, 1, 0, 1},
        {0, 2, 0, 1, 1, 0, 1}
    };
    /**
             * @param args the command line arguments
             */

    public static void main(String[] args) {
        int[][] a = mt;
        vypisMatici(a, "Testovaci matice");
        int[][] vysl = new int[a.length][a[0].length];

        // radky
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                vysl[i][j] = PiskvorkyTools.pocetStejnychVRadce(a, i, j);
            }
        }
        vypisMatici(vysl, "Test po radcich");

        // sloupce
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                vysl[i][j] = PiskvorkyTools.pocetStejnychVSloupci(a, i, j);
            }
        }
        vypisMatici(vysl, "Test po sloupcich");

        // diagonalni smer
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                vysl[i][j] = PiskvorkyTools.pocetStejnychVDiag1(a, i, j);
            }
        }
        vypisMatici(vysl, "Test v diagonalnim smeru");

        // antidiagonalni smer
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                vysl[i][j] = PiskvorkyTools.pocetStejnychVDiag2(a, i, j);
            }
        }
        vypisMatici(vysl, "Test v antidiagonalnim smeru");

    }

    private static void vypisMatici(int[][] a, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        for (int[] v : a) {
            for (int h : v) {
                System.out.format("%4d ", h);
            }
            System.out.println("");
        }
    }

}
