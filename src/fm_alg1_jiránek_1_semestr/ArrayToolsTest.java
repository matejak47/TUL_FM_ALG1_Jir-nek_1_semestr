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
public class ArrayToolsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Otestování třídy maximum
        int [] a = {1,5,6,2,3,9,4};
        int max = ArrayTools.maximum(a);
        System.out.println("Maximum v poli je " + max);
        
        //otestování třídění vkládáním
        double [] b = {2.1,3.6,1.2,7.5,5.8,6.9};
        ArrayTools.sort1(b,3);
        System.out.println("Pole po třídění: ");
        for (double value : b) {
            System.out.print(value + " ");
        }
        System.out.println("");
        
        //Otestování třídění výběrem
        int[] c = {5,2,3,1,4,6};
        ArrayTools.sort2(c);
        System.out.println("Pole po třídění: ");
        for (int value : c) {
            System.out.print(value + " ");
        }
        System.out.println("");
        
        //otestování pozice vyskytu
        int [] d = {5,8,6,2,3,4,11,2,1,6,9,21};
        int pozice = ArrayTools.poziceVyskytu(d, 3, 1, 6);
        System.out.println("Index hledaneho cisla je " + pozice );
        
        //otestovaní vyskyt v poli usporadane
        int [] e = {5,8,6,2,3,4,11,2,1,6,9,21};
        int pozice1 = ArrayTools.vyskytVUspo(e, 6, 2);
        System.out.println("Cislo po vzestupnem usporadani je na indexu " + pozice1);
        
        //otestovani poct ruznych cisel
        int [] f = {1,1,1,2,2,3,3,3,4,5,5,5};
        int ruznych = ArrayTools.pocetRuznychUsp(f);
        System.out.println("V poli je "+ruznych+" ruznych cisel");
        
        //overereni revrese
        int[] g = {1,1,1,2,2,3,3,3,4,5,5,5};
        ArrayTools.reverse(g);
        System.out.println("Pole po přeházení: ");
        for (int value : g) {
            System.out.print(value + " ");
        }
        System.out.println("");
        
        //overeni get reversed
        int[] h = {1,1,1,2,2,3,3,3,4,5,5,5};
        int [] i = ArrayTools.getReversed(h);
        System.out.println("Pole po přeházení: ");
        for (int value : i) {
            System.out.print(value + " ");
        }
        System.out.println("");
                
    }
    
}
