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
public class VypisVlajky {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej jak chces aby vlajka byla vysoka");
        int n = sc.nextInt();
        n = n/2;
        System.out.println("Zadej jak chceš aby byla široká");
        int z = sc.nextInt();
        System.out.println("Zadej jake znaky chceš aby byly v cípu");
        char c = sc.next().charAt(0);
        System.out.println("Zadej jake znaky chceš aby byly nahore");
        char up = sc.next().charAt(0);
        System.out.println("Zadej jake znaky chceš aby byly dole");
        char down = sc.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c +" ");

            }
            for (int j = 1; j <= z - i; j++) {
                System.out.print(up +" ");

            }
            System.out.print("\n");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c +" ");
            }
            for (int k = 1; k <= z - i; k++) {
                System.out.print(down +" ");
            }
            System.out.print("\n");
        }
    }

}
