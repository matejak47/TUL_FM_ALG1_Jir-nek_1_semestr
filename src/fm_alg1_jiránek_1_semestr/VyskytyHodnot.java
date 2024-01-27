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
public class VyskytyHodnot {

    private static final Scanner sc = new Scanner(System.in);
    private static int delka = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pole[] = nacti();
        int n = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > 0) {
                n++;
            }
        }

        // Vytvoření pole seradit až po zjištění počtu kladných čísel
        int seradit[] = new int[n];
        n = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > 0) {

                System.out.println("číslo " + i + " se zde vyskytuje " + pole[i] + "x");
                if (max < pole[i]){
                max = pole[i];
                index = i;
                }
                seradit[n] = pole[i];
                n++;
            }
        }
        System.out.println("Cislo " + index + " má nejvíce počet výskytů a to " + max +"x");
        Arrays.sort(seradit);
        for (int cislo : seradit) {
            System.out.print(cislo + " ");
        }

    }

    public static int[] nacti() {
        int cislo;
        int[] pole = new int[10000];
        do {
            cislo = sc.nextInt();
            if (cislo < 0) {
                break;
            }
            pole[cislo]++;
            delka++;

        } while (cislo > 0);

        return pole;

    }

}
