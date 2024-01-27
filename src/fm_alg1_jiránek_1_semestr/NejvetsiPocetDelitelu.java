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
public class NejvetsiPocetDelitelu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej cisla (a,b) ale kladná pokud budou záporná prgorma se ukončí");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxDelitele = 0;
        int NWM = a;

        if (a <= 0 || b <= 0) {
            System.out.println("Konec programu");
        } else {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
                System.out.printf("Doslo k vymene: a = %d, b = %d.\n", a, b);
            }

        }
        for (int i = a; i <= b; i++) {
            int del = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    del++;
                }
            }
            if (del > maxDelitele) {
                maxDelitele = del;
                NWM = i;
            }
        }

        System.out.println("Největší počet vlastních dělitelů je: " + maxDelitele);
        System.out.println("Číslo s největším počtem vlastních dělitelů je: " + NWM);
    }

}
