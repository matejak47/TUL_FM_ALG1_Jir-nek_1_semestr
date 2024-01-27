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
public class CeleCislo {

    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
      System.out.println("Zadej číslo u kterého chceš zjistit čím se dá dělit");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            if(n%i == 0){
                if (i==1){
                
                continue;
                }else if (i == n ){
                continue;
                }else{
                
                System.out.println(i);}
                
            }
            
        }
            System.out.println("Zadej číslo u kterého chceš zjistit kolik má vlastních dělitelů");
            int p1 = sc.nextInt();
            int pocet = 0;
      
         for (int i = 1; i <= p1; i++) {
            
            if(p1%i == 0){
                if (i==1){
                
                continue;
                }else if (i == p1 ){
                continue;
                }else{
                pocet++; 
                }
            
            }
        }
         System.out.println(pocet);
         System.out.println("Zadej číslo a ja ti řeknu zda je prvočíslem");
         int prv = sc.nextInt();
         int del = prv-1;
         int temp = 0;
         int temp2 = 0;
         while (del>1){
         
         int vysled = prv%del;
         
         if (vysled == 0){
             temp++;
             
         }
         else{temp2++;}
         
         del--;
             
         
         
         
         
         
         }
         if (temp >0){System.out.println("Cislo neni prvosilo");
         }else{System.out.println("cislo je prvocislo");}
      
        System.out.println("Napis cislo a ja ti ho vypisu jako soucin prvocisel");
        int socin = sc.nextInt();
        int k = 2;
        System.out.format("Cislo %d jsem rozdelil na: ",socin, k);
        while (socin >= 1) {
            if (socin%k == 0) {
                System.out.format("%d ",k);
                socin = socin/k;
            }
            if (socin%k != 0 && k == 2) {
                k = 3;
            }
            if (socin%k != 0 && k == 3) {
                k = 5;
            }
            if (socin%k != 0 && k == 5) {
                k = 7;
            }
            if (socin%k != 0 && k == 7) {
                k = 11;
            }
            if (socin%k != 0 && k == 11) {
                System.out.format("%d",socin);
                break;
            }
        }
        System.out.println("\n");
         
    }
    
}
