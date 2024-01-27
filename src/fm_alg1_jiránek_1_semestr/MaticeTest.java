/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matee
 */
public class MaticeTest {

    private static final Scanner sc = new Scanner(System.in);
    private static int[][] matA = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu;
        do {
            vypisMenu();
            int volba = nactiVolbu();
            konecProgramu = obsluzVolbu(volba);
        } while (!konecProgramu);
        System.out.println("Koncim ...");

    }

    private static void vypisMenu() {
        System.out.println("");
        System.out.println("1. Nacti matici");
        System.out.println("2. Je symetricka podle diagonaly");
        System.out.println("3. Je symetricka dle diagonaly 2");
        System.out.println("4. Je symetricka dle Horizontalní osy");
        System.out.println("5. Je symetricka dle vertikalní osy");
        System.out.println("6. Vytvořím jednotkovou matici o rozměru N");
        System.out.println("0. Konec programu");
    }

    private static int nactiVolbu() {
        int volba;
        try {
            volba = sc.nextInt();
        } catch (InputMismatchException ex) {
            volba = -1;
        }
        sc.nextLine();
        return volba;
    }

    private static boolean obsluzVolbu(int volba) {
        switch (volba) {
            case 1:
                matA = nactiMatici();
                break;
            case 2:
                if(MaticeTools.jeSymetrickaDleDiag(matA) == true){
                    System.out.println("Ano matice je symetricka dle diagonaly ");
                }else{
                System.out.println("Ne matice není symetricka dle diagonaly ");
                }
                break;
            case 3:
                if(MaticeTools.jeSymetrickaDleDiag2(matA) == true){
                    System.out.println("Ano matice je symetricka dle diagonaly2 ");
                }else{
                System.out.println("Ne matice není symetricka dle diagonaly2 ");
                }
                break;
            case 4:
                if(MaticeTools.jeSymetrickaDleHorizOsy(matA) == true){
                System.out.println("Ano matice je symetricka dle Horizontalni osy ");
                }else{
                    System.out.println("Ne matice není symetricka dle Horizontalni osy ");
                }
                break;
            case 5:
                if(MaticeTools.jeSymetrickaDleVertOsy(matA) == true){
                    System.out.println("Ano matice je symetricka dle Vertikalni osy");
                }else{
                    System.out.println("Ne matice není symetricka dle Vertikalni osy ");
                }
                break;
            case 6:
                System.out.println("Zadej velikost pole");
                int j =sc.nextInt();
                vypisMatici(MaticeTools.jednotkovaMatice(j),"Jednotkova matice");
                break;
            case 0:
                return true;
            default:
                System.out.println("Neznama volba");
        }
        return false;
    }

    private static int[][] nactiMatici() {
        System.out.println("");
        System.out.println("Nacteni matice");
        System.out.println("Zadej pocet radku a sloupcu");
        int pr = sc.nextInt();
        int ps = sc.nextInt();
        System.out.println("Zadej prvky matice po radcich");
        int [][] mat = new int [pr][ps];
        for (int i = 0; i < pr; i++) {
            for (int j = 0; j < ps; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        return mat;
    }

    private static void vypisMatici(double[][] mat, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        if (mat == null) {
            System.out.println("Matice neni zadana");
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%6.2f ", mat[i][j]);
            }
            System.out.println("");
        }

    }
    

}
