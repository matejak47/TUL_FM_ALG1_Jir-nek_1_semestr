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
public class KalkulatorSPrioritou {

    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("zadej aritmetický výraz");
        char op = ' ';
        float temp0 = 0;
        float temp2 = 1;
        
        float a = sc.nextInt();
        op = sc.next().charAt(0);
        while(op != '='){
           
            float number = sc.nextFloat();
            switch (op) {
                case '+':
                    temp0 = temp0 + temp2 * a;
                    a = number;
                    temp2 = 1;
                    break;
                case '-':
                    temp0 = temp0 + temp2 * a;
                    a = number;
                    temp2 = -1;
                    break;
                case '*':
                    a = a * number;
                    break;
                case '/':
                    a = a / number;
                    break; 
            }
            op = sc.next().charAt(0);

        }
        temp0 = temp0+temp2*a;
        System.out.println("vysledek je " + temp0);
    }
    
}
