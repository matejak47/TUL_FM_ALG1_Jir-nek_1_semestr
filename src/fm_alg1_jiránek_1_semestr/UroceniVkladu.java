/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author matee
 */
public class UroceniVkladu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Zadej Kapitál");
        int k = sc.nextInt();
        System.out.println("Zadej roční úročení vkladu");
        int u = sc.nextInt();
        System.out.println("Zadej jak často se bude připisovat za rok");
        int m = sc.nextInt();
        System.out.println("Zadej kolik let chceš uročit");
        int n = sc.nextInt();
        
        
        int zavorky = (1+((u/100)/m));
        int mn = m*n;
        long zavorkypower = (int)Math.pow(zavorky, mn);
        long Kn = zavorkypower * k;
        
        
        System.out.println("Hodnota tvého kapitálu je " + Kn + " po " + n + " letech." );
        
    }
    
}
