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
public class DatetimeToolsTest {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej rok");
        int rok = sc.nextInt();
        System.out.println("Zadej měsíc");
        int mesic = sc.nextInt();
        System.out.println("Zadej den");
        int den = sc.nextInt();

        boolean prestup = DatetimeTools.jePrestupnyRok(rok);
        System.out.println("Rok " + ((prestup) ? ("je ") : ("neni ")) + "prestupny");

        boolean platne = DatetimeTools.jePlatneDatun(den, mesic, rok);
        System.out.println("Toto datum " + ((platne) ? ("je ") : ("neni ")) + "platné");

        int dweek = DatetimeTools.denTydne(den, mesic, rok);
        switch (dweek) {
            case 2:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je pondělí");
                break;
            case 3:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je úterý");
                break;
            case 4:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je středa");
                break;
            case 5:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je čtvrtek");
                break;
            case 6:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je patek");
                break;
            case 0:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je sobota");
                break;
            case 1:
                System.out.println("V tento datum " + den + "." + mesic + "." + rok + "." + " je neděle");
                break;

        }

    }

}
