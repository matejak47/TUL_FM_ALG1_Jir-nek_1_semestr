/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;
import java.util.Random;    

/**
 *
 * @author matee
 */
public class HadaniCisla {
private static final Scanner sc = new Scanner(System.in);
private static final Random rnd = new Random();
private static int DolniMez = 1;
private static int HorniMez = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu;
        do{
        vypisMenu();
        int volba = nactiVolbu();
        konecProgramu = obsluzVolbu(volba);
        
        }while(!konecProgramu);
    }

    private static void vypisMenu() {
        System.out.println("");
        System.out.println("Hra hadani cisla");
        System.out.println("1. Budu hádat");
        System.out.println("2. Budu si myslet cislo");
        System.out.println("3. Nastaveni");
        System.out.println("0. konec");
        
    }

    private static int nactiVolbu() {
        System.out.println("Zadej cislo volby");
        int volba = sc.nextInt();
        return volba;
       
    }

    private static boolean obsluzVolbu(int volba) {
        switch  (volba){
            case 0 : return true;
            case 1 : hratHracHadaCislo(); break;
            case 2 : hratHruHracSiMysliCislo();break;
            case 3 : nastaveniProgramu();break;
            default: System.out.println("Neznama volba "+ volba);
        
        
        }
        return false;
    }

    private static void hratHracHadaCislo() {
        System.out.println("");
        System.out.println("Budu si myslet cislo postupne zadavej sve typy");
        int a = rnd.nextInt(HorniMez);
        int n ;
        
        do{
            n = sc.nextInt();
            
        if (n>a){
            System.out.println("Uber");
        }else if (n<a){
            System.out.println("Přidej");
        }
        
        
        }while(a != n);
        
        System.out.println("Trefil jsi se ");
    }

    private static void hratHruHracSiMysliCislo() {
        System.out.println("");
        System.out.println("Mysli si cislo a ja budu hádat");
        boolean anw = false;
        int HorniMezCopy = HorniMez+1;
        int DolniMezCopy = DolniMez;
        do{
            int a = rnd.nextInt(DolniMezCopy,HorniMezCopy);
            System.out.println(a);
            int value = sc.nextInt();
            if (value == 0){
                HorniMezCopy = a-1;
            
            }else if (value == 1){
                DolniMezCopy = a+1;
            
            }else if (value == 3){
            anw = true;
            }
            
        
        }while(!anw);
        
        System.out.println("Trefil jsi se");
        
    }

    private static void nastaveniProgramu() {
        System.out.println("");
        System.out.println("Aktualni horni mez je " + HorniMez);
        System.out.println("Zadej novou horní mez ");
        HorniMez = sc.nextInt();
        System.out.println("Nová horní mez je " + HorniMez);
        
    }
    
}
