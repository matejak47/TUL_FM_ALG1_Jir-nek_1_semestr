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
public class PrevodSekund {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej počet hodin");
        int hodiny = sc.nextInt();
        System.out.println("Zadej počet minut");
        int min = sc.nextInt();
        System.out.println("Zadej počet vteřin");
        int sec = sc.nextInt();
        int finish = (hodiny*(60*60)) + (min*60) + sec;
        System.out.println(finish);
        
        System.out.println("Ted mi zadej počet sekund co chceš převéct");
        int prevod = sc.nextInt();
        int HH = (prevod / 3600);
        int MM = (prevod - (HH*3600))/60;
        int SS = ((prevod - (HH*3600))- (MM * 60));
        System.out.println( HH + ":" + MM + ":" + SS);
    }
    
}
