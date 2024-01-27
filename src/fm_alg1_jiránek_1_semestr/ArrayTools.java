/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;

/**
 *
 * @author matee
 */
public class ArrayTools {

    private ArrayTools() {
    }

    public static int maximum(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            //Zjistuje jestli cislo ktere je na rade je vetsi nez max pokud ano tak ho nastavi jako max
            if (max < a[i]) {

                max = a[i];
            }
        }
        return max;
    }

    public static void sort1(double[] a,int n) {
       
        for (int i = 1; i < n; i++) {
            double key = a[i];
            int j = i - 1;

            // Posunout prvky pole vpravo, které jsou větší než key
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        
    }

    public static void sort2(int[] a) {
        
         for (int i = 0; i < a.length - 1; i++) {
            // Nalezení nejmenšího prvku v neuspořádané části pole
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Výměna nalezeného nejmenšího prvku s prvním prvkem neuspořádané části
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    public static int poziceVyskytu(int[] a, int cislo, int d, int h) {
        int index = -1;
        // tento for projede pole od d do h a az narazi na prvni shodu tak vrati index
        for (int i = d; i <= h; i++) {
            if (cislo == a[i]) {
                return i;
            }

        }

        return index;
    }

    public static int vyskytVUspo(int[] a, int n, int cislo) {
        // Metoda pro binární vyhledáváni

        int left = 0;
        int right = n - 1;
        // serazeni pole
        sort2(a);

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Pokud je cislo na středové pozici
            if (a[middle] == cislo) {
                return middle;
            }

            // Pokud je cislo menší, hledej v levé polovině
            if (a[middle] > cislo) {
                right = middle - 1;
            } // Pokud je cislo větší, hledej v pravé polovině
            else {
                left = middle + 1;
            }
        }
        // Cislo se v poli nenachází
        return -1;

    }

    public static int pocetRuznychUsp(int[] a) {
        sort2(a);
        //nejdrive si to mysli ze vsychny cisla jsou ruzne
        int pocet = a.length;
        
        for (int i = 0; i < a.length-1; i++) {
            //a zde to porovnava vzdy sousedni cisla a pokud jsou stejna tak to odecte pocet
            if (a[i] == a[i+1]){
            pocet--;
            }
        }
        return pocet;
        
    }

    public static void reverse(int[] a) {
        int temp = 0;
        
        //Zde jedou dva fory proti sobe kde se vzdy prhodi posledni s polsednim druhy s predposlednim a takle to je ke stredu z obou stran
        for (int i = 0,k = a.length-1; (i < a.length/2 && k>a.length/2); i++,k--) {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
        }
    }

    public static int[] getReversed(int[] a) {
        int [] b = new int [a.length];
        
        //Zde jedou dva fory jeden jeden v nove matici od 0 a druhy od posledniho cisla v matici na vstupu a od polsedniho to vklada postupne za sebe od predu do nove matice
        for (int i = a.length - 1, k = 0; (i >=0 && k <= a.length); i--,k++) {
            
            b[k] = a[i];
            
        }
        
        // vrati nnovou matici
        return b;
    }
}
