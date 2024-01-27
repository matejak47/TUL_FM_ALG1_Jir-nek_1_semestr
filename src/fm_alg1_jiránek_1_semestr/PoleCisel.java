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
public class PoleCisel {

    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] a;
        
        System.out.println("Zjisti maximalni hodnotu a jeji pozice");
        System.out.println("Zadej velikost pole ");
        int pocet = sc.nextInt();
        System.out.println("Zadavej cislo do pole ");
        a = new int[pocet];
        int max = 0;
        int pozice =0;
        for (int i = 0; i < pocet; i++) {
            a[i]= sc.nextInt();   
        }
        for (int i = 0; i < pocet; i++) {
            if (a[i] > max){
              max = a[i];
              pozice = i;
            }
        }
        System.out.println("Největší číslo je " + max + " a je na pozici " + pozice);
        
    }
    
}
