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
public class MagickyCtverec {
private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean jsouVsechnyCisla = true;
        boolean jsouStejneSoucty = true;
        System.out.println("Zadej velikost ctvercove matice");
        int n = sc.nextInt();
        System.out.println("Zadej prvky matice");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }

        }

        for (int i = 1; i < n * n; i++) {
            boolean jeCislo = false;
            TEST_CISLA:
            for (int g = 0; g < n; g++) {
                for (int j = 0; j < n; j++) {
                    if (a[g][j] == i) {
                        jeCislo = true;
                        break TEST_CISLA;
                    }

                }

            }
            if (!jeCislo) {
                jsouVsechnyCisla = false;
            }
        }
        
          boolean[] vyskytCisla = new boolean[n * n];
        int[] pocetVyskytu = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0 && a[i][j] <= n) {
                    vyskytCisla[a[i][j] - 1] = true;
                }

                pocetVyskytu[a[i][j] - 1]++;
            }

        }
        jsouVsechnyCisla = true;
        for (int i = 0; i < vyskytCisla.length; i++) {
            if (!vyskytCisla[i]) {
                jsouVsechnyCisla = true;
                break;

            }

        }
        //soucet diagonaly
        int soucetd = 0;
        for (int i = 0; i < a.length; i++) {
            
                soucetd += a[i][i];

            
        }
        //soucet antidiagonaly
        int soucetdanti = 0;
        for (int i = 0; i < a.length; i++) {
            soucetdanti += a[i][n-i-1];
        }
        int soucet;
        for (int i = 0; i < n; i++) {
            soucet =0;
            for (int j = 0; j < n; j++) {
                soucet += a[i][j];
                
            }
            if (soucet  !=soucetd){
               jsouStejneSoucty = false;
            break;
            }
            
            
        }
        //soucet radku
        int soucetline =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
               soucetline += a[i][j]; 
            }
            if (soucetline != soucetd){
             jsouStejneSoucty = false;
             break;
            }else{
            soucetline =0;
            }
            
            
        }
        //soucet sloupcu
        int soucetrow =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                soucetrow += a[j][i];
                
            }
            if (soucetrow != soucetd){
             jsouStejneSoucty = false;
             break;
            }else{
            soucetrow =0;
            }
            
        }
        
        System.out.format((jsouStejneSoucty)?"ano ctverec je magicky \n":"ctverec neni magicky \n");
        
    }
    
}
