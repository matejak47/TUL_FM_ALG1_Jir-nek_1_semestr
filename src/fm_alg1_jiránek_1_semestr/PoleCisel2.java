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
public class PoleCisel2 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        int[] a;
        a = new int[100];
        int i = 0;
        System.out.println("Pocet cisel delitelnych zadanym cisel");
        System.out.println("Zadavej kladna cisla ukonceni zapornym");
        do {
            num = sc.nextInt();
            if (num > 0) {
                a[i] = num;
                i++;
            }

        } while (num > 0);
        System.out.println("Zadej hledaneho delitele");
        int delitel = sc.nextInt();
        int pocet = 0;
        for (int j = 0; j < i; j++) {
            if (a[j] % delitel == 0) {
                pocet++;
            }

        }

        System.out.println("POcet delitelu je " + pocet);

    }

}
