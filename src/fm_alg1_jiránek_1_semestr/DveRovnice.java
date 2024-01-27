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
public class DveRovnice {
    
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        System.out.print("d: ");
        double d = sc.nextDouble();
        System.out.print("e: ");
        double e = sc.nextDouble();
        System.out.print("f: ");
        double f = sc.nextDouble();
        
        double det = a*e - b*d;
        
        if (det == 0){
            System.out.println("Rovnice jsou lineárně závislé, nemají jednoznačné řešení");
        
        }else {
            double x = (c * e - b * f) / det;
            double y = (a * f - c * d) / det;
            System.out.println("Řešení: x = " + x + ", y = " + y);
        
        }
    }
    
}
