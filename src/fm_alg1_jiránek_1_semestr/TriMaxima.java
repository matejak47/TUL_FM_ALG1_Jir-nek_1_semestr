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
public class TriMaxima {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej čísla a ja ti npíšu tři největší");
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        do{
            if (n > max1){
            max2 = max1;    
            max1 = n;
            }else if (n > max2){
            max3 = max2;    
            max2 = n;
            }else if (n > max3){
                max3 = n;
            }
            n = sc.nextInt();
        
        }while(n>0);
        System.out.format("Největší číslo je %d druhé největší je %d a třetí njevětší je %d \n",max1 , max2, max3);
    }
    
}
