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
public class StringTest {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        String heslo;
        byte zaklad;
        long cislo;   

        System.out.println("Zadej slovo a ja reknu zda je palindrom");
        text = sc.nextLine();
        System.out.println(StringTools.jePalindrom(text));

        System.out.println("Zadej z jake soustavy chces prevadet");
        zaklad = sc.nextByte();
        System.out.println("Zadej jake cislo chces prevect");
        text = sc.nextLine();
        System.out.println(StringTools.prevodDoDesitkove(text, zaklad));

        System.out.println("Zadej do jake soustavy chces prevect");
        zaklad = sc.nextByte();
        System.out.println("Zadej ktere cislo chces prevect");
        cislo = sc.nextLong();
        System.out.println(StringTools.prevodZDesitkove(cislo, zaklad));

        System.out.println("Zadej text ktery chces zasifrovat");
        text = sc.nextLine();
        System.out.println("Zadej heslo podle ktereho mam siforvat");
        heslo = sc.nextLine();
        System.out.println(StringTools.sifruj(text, heslo));

        System.out.println("Zadej text ktery chces desifrovat");
        text = sc.nextLine();
        System.out.println("Zadej heslo pomoci ktereho to chces desifrovat");
        heslo = sc.nextLine();
        System.out.println(StringTools.desifruj(text, heslo));

    }

}
