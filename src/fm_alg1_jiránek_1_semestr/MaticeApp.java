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
public class MaticeApp {

    private static final Scanner sc = new Scanner(System.in);
    private static double[][] matA = null;
    private static double[][] matB = null;

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
        System.out.println("Hlavni menu programu");
        System.out.println("1. Nacti prvni matici");
        System.out.println("2. Nacti druhou matici");
        System.out.println("3. Vypis matice");
        System.out.println("4. Vzajemna vymena obou matic");
        System.out.println("5. Vypocitat a vypsat soucet obou matic");
        System.out.println("6. Vypocitat a vypsat soucin obou matic");
        System.out.println("7. Transpozice prvni matice");
        System.out.println("8. Prevod druhe matice do normovaneho tvaru");
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
            case 0:
                return true;
            case 1:
                matA = nactiMatici();
                break;
            case 2:
                matB = nactiMatici();
                break;
            case 3:
                vypisObouMatic();
                break;
            case 4:
                vzajemnaVymenaMatic();
                break;
            case 5:
                vypocetSouctuMatic();
                break;
            case 6:
                vypocetSoucinuMatic();
                break;
            case 7:
                maticeTransponovana();
                break;
            case 8:
                prevedDoNorm();
                break;
            default:
                System.out.println("Neznama volba");
        }
        return false;
    }

    static double[][] nactiMatici() {
        System.out.println("");
        System.out.println("Nacteni matice");
        System.out.println("Zadej pocet radku a sloupcu");
        int pr = sc.nextInt();
        int ps = sc.nextInt();
        System.out.println("Zadej prvky matice po radcich");
        double[][] mat = new double[pr][ps];
        for (int i = 0; i < pr; i++) {
            for (int j = 0; j < ps; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        sc.nextLine();
        return mat;
    }

    private static void vypisObouMatic() {
        System.out.println("");
        vypisMatice(matA, "Matice A");
        vypisMatice(matB, "Matice B");
    }

    private static void vypisMatice(double[][] mat, String titulek) {
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

    private static void vzajemnaVymenaMatic() {
        double[][] temp = new double[matA.length][matA[0].length];
        temp = matA;
        matA = matB;
        matB = temp;
        System.out.println(" ");
        vypisMatice(matA, "Matice A");
        vypisMatice(matB, "Matice B");

    }

    private static void vypocetSouctuMatic() {
        
        double[][] result = MaticeTools.soucetMatic(matA, matB);
        if (result != null) {
            vypisMatice(result, "Matice souctu");
        } else {
            System.out.println("Matice nema stejne rozmery jako ta druha");
        }

    }

    private static void vypocetSoucinuMatic() {
        
        double[][] result = MaticeTools.soucinMatic(matA, matB);
        if (result != null) {
            vypisMatice(result, "Matice součinu");
        } else {
            System.out.println("Nelze provést násobení matic. Počet sloupců matice A musí být roven počtu řádků matice B.");
        }
        

    }

    private static void maticeTransponovana(){
    
    double[][] result = MaticeTools.maticeTransponovana(matA);
    vypisMatice(result, "Transponovana matice");
    }
    
    private static void prevedDoNorm(){
        
        matA =  MaticeTools.prevedDoNorm(matA);
        vypisMatice(matA, "Transponovana matice");
    
    
    }
}
