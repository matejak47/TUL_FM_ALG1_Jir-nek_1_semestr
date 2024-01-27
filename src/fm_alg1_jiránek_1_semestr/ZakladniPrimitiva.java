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
public class ZakladniPrimitiva {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Budes zadávat cisla dokud nezadas zaporne");
        int n = 0;
        int soucet = 0;
        int prumer = 0;
        n = sc.nextInt();
        do {
            soucet += n;
            n = sc.nextInt();
            prumer++;

        } while (n > 0);
        System.out.println("Soucet je " + soucet);
        System.out.println("Prumer je " + soucet / prumer);

        System.out.println("zadej cisla ktere chces secist a ja ti napisu průměr");
        System.out.println("Zadej kolik cisel chces spocitat");
        int a = sc.nextInt();
        float min = 0;
        float max = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Zadej " + i + ".");
            float b = sc.nextFloat();

            if (i == 1) {

                max = b;
                min = b;
            } else {
                if (b > max) {
                    max = b;
                }
                if (b < min) {
                    min = b;
                }
            }
        }
        System.out.println("Minimální hodnota je " + min);
        System.out.println("Maximální hodnota je " + max);
        System.out.println("Zadej sadu čísel a ja ti eknu zda je posloupnost vzestupná");
        System.out.println("Zadej jak velká bude posloupnost");
        int z = sc.nextInt();
        int temp = 0;
        int temp2 = 0;
        for (int i = 1; i <= z; i++) {
            System.out.println("Zadej " + i + ".");
            int c = sc.nextInt();

            if (c > temp) {
                temp = c;
            } else {
                temp2++;
            }

        }
        if (temp2 > 0) {
            System.out.println("Posloupnost není vzestpuná");

        } else {
            System.out.println("Posloupnost je vzestupná");
        }
    }

}
