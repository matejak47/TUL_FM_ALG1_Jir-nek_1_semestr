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
public class KvadrantBodu {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Zadej body x a y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>0 & y>0) {
            System.out.println("Nacházíš se v prvním kvadrantu");}
        if (x<0 & y>0){
            System.out.println( "Nacházíš se v druhem kvadrantu");}
        if (x<0 & y<0){
            System.out.println( "Nacházíš se v třetím kvadrantu");}
        if (x>0 & y<0){
            System.out.println( "Nacházíš se v čtvrtém kvadrantu");}
        
        
        
        
    }
    
}
