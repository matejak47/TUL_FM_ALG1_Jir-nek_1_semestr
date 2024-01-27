/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author matee
 */
public class PexesoTools {

    private static final Random rnd = new Random();

    private PexesoTools() {

    }

    /**
     * Vytvori a v poli celych cisel vrati nahodnou permutaci cisel
     *
     * @param n velikost permutace
     * @return pole s vytvorenou permutaci
     */
    public static int[] getPermutace(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = a.length - 1; i > 0; i--) {

            int index = rnd.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        return a;
    }

    /**
     * zadej počet radku a počet sloupcu a ja ti zamícháma cisla POkud člověk
     * zadá velikost matice a součin radku a sloupcu bude lichy tak metoda
     * vyhodi null protoze pexeso se da hrat se seudym poctem dvojic
     *
     * @param pr počet radku
     * @param ps počet sloupcu
     * @return
     */
    public static int[][] getMaticePexeso(int pr, int ps) {
        if (pr * ps % 2 != 0) {
            return null;
        }
        int pd = (pr * ps / 2);
        int[][] pexeso = new int[pr][ps];
        int prvni[] = getPermutace(pd);
        int druha[] = getPermutace(pd);

        for (int i = 0; i < pr; i++) {
            for (int j = 0; j < ps; j++) {

                int index = i * ps + j;

                if (index < prvni.length) {
                    pexeso[i][j] = prvni[index];
                } else {
                    pexeso[i][j] = druha[index - druha.length];
                }

            }

        }

        return pexeso;
    }

    /**
     * Zadej matici a ja ti zjistim zda s ni muzes hrat pexeso
     *
     * @param a zadej matici kterou chceš zkontrolovat
     * @return
     */
    public static boolean jeMaticePexeso(int[][] a) {
        int pd = (a.length * a[0].length) / 2;
        int[] pocetCisel = new int[pd];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int cislo = a[i][j];

                if (cislo >= 1 && cislo <= pd) {
                    pocetCisel[cislo - 1]++;
                }
            }
        }

        for (int pocet : pocetCisel) {
            if (pocet != 2) {
                return false;
            }
        }

        return true;

    }

    /**
     * Tato metoda vypise prumernou vzdalenost mezi hodnotami
     *
     * @param a zadej matici
     * @return
     */
    public static double rozhazenost(int[][] a) {
        int pd = (a.length * a[0].length) / 2;

        double vzdsoucet = 0;
        for (int k = 1; k <= pd; k++) {

            int tempi = -1;
            int tempj = -1;
            TEMP:
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {

                    if (a[i][j] == k) {
                        if (tempi > -1) {
                            vzdsoucet += Math.abs(tempi - i) + Math.abs(tempj - j);
                            break TEMP;
                        }
                        tempi = i;
                        tempj = j;
                    }

                }
            }
        }

        // predpokladame, ze se kazde z cisel vyskytuje v matici prave 2x
        // pro kazde z cisel 1, 2, ... pd zjistit jaka ve vdalenost 
        // dvou vyskytu tohoto cisla
        // metoda ma vratit prumernou hodnotu techto vzdalenosti
        // vzdalenost dvou poli matice na pozicich (r1, s1) a(r2, s2]
        // vypocteme jako vzd = |r1-r2| + |s1-s2|
        // pokud metoda nenajde vyskyt nebo druhy vyskyt nejakeho cisla,
        // necht vrati jeho zapornou hodnotu 
        return vzdsoucet / pd;
    }

}
