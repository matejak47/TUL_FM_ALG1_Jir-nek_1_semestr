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
public class UsekovaRychlost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jaká je max rychlost v tomto useku v KM/H");
       
        double v = (sc.nextInt())/3.6;
        
         System.out.println("Zadejte délku vašeho úseku v KM");
         
        double s = (sc.nextInt())*1000;
        
        /* Start */
        System.out.println("Zadejte prujezd začátkem [hh mm ss set]:");
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();
        int set1 = sc.nextInt();
        
        /* KOnec */
        System.out.println("Zadejte kdy projel koncem: [hh mm ss set]:");
        int hour2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();
        int set2 = sc.nextInt();
        
        /* Prevod na hodiny */
        
        double cas1 = (hour1*3600 + (min1*60)+ sec1 + (set1/100) );
        double cas2 = (hour2*3600 + (min2*60)+ sec2 + (set2/100) );
        
        double t = cas2 - cas1;
        
        double v2 = (s/t);
        double Vysledek = (v2 - v)*3.6;
        double prumerch = (s/t)* 3.6;
       
        System.out.println("Rychlost byla překročena o " + Vysledek);
        System.out.println("Průměrná ryhclost byla " + prumerch);
    }
    
    
}
