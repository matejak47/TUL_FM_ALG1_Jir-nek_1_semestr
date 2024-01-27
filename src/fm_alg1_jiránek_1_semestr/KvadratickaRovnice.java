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
public class KvadratickaRovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej čelny kvadratické rovnice a, b, c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double lin = (a == 0) ? -(b/c):0;
        double dis = Math.pow(b, 2) - 4*a*c;
        double R1 = (dis >= 0) ?  ((-b+Math.sqrt(dis))/(2*a)):0;
        double R2 = (dis >= 0) ?  ((-b-Math.sqrt(dis))/(2*a)):0;
        double real = (dis < 0) ? (-b/(2*a)):0;
        double img = (dis < 0) ? Math.sqrt(-dis) / (2 * a):0;
    
        if (dis >= 0){
            if (a > 0){
        System.out.format("Vysledek v oboru R\nx1: %.2f\nx2: %.2f \n\n", R1 , R2);}}
        if (dis < 0){
        System.out.format("Vysledek v oboru C\nx1: %.2f + %.5f i\nx2: %.2f - %.5f i\n\n",real,img,real,img);}
        if (a == 0){
        System.out.format("Výsledek lineární rovnie\nx: %.3f \n",lin);}
        
        
    }
    
}
