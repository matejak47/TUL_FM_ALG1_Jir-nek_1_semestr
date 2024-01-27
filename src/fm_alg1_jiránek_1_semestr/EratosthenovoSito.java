/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author matee
 */
public class EratosthenovoSito {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int zadek = 0;
        int k = sc.nextInt();
        k += 1;
        boolean[] pole = new boolean[k];
        Arrays.fill(pole, true);

        for (int i = 2; i < Math.sqrt(k - 1); i++) {

            for (int j = i + 1; j < k; j++) {

                if (j % i == 0) {
                    pole[j] = false;
                }
            }
        }

        for (int i = 2; i < k; i++) {
            if (pole[i] == true) {
                System.out.println(i);
                zadek++;
            }

        }
        System.out.println("Je tu " + zadek + " prvocisel");

    }

}
