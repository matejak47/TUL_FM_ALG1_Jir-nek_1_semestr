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
public class VypocetTeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Napiš délky tří stran");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double Vkvadr = a*b*c;
        double Skvadr =2*(a*b+a*c+b*c);
        double HranaKrychleV = Math.pow(Vkvadr,1.0/3.0);
        double HranaKrychleS = Math.sqrt(Skvadr/6.0);
        double polomerV = Math.pow(Vkvadr/(4.0/3.0*3.14),1.0/3.0);
        double polomerS = Math.sqrt(Skvadr/(4.0*3.14));
        double strana4V = Math.pow(12*Vkvadr/Math.sqrt(2), 1.0/3.0);
        double strana4S = Math.sqrt(Skvadr/Math.sqrt(3));
        
        System.out.format("Obejm kvadru je %.2f a obsah je %.2f \n", Vkvadr, Skvadr);
        System.out.format("Hrana krychle z Objemu je %.2f \n ",HranaKrychleV);
        System.out.format("Hrana krychle z obsahu je %.2f \n ", HranaKrychleS);
        System.out.format("Poloměr koule z objemu je %.2f \n", polomerV);
        System.out.format("Pomoměr koule z obsahu %.2f \n", polomerS);
        System.out.format("Strana z čtyřhranu má %.2f \n", strana4V);
        System.out.format("Strana z čtyřhranu má %.2f \n", strana4S);
  
        
        
    }
    
}
