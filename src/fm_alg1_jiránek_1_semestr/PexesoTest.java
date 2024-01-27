/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Arrays;

/**
 *
 * @author matee
 */
public class PexesoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PexesoTools.getPermutace(6)));
        
        int [][] a = PexesoTools.getMaticePexeso(100, 100);
        
        //vypisMatici(a,"Pexeso");
        
        if (PexesoTools.jeMaticePexeso(a)) {
            System.out.println("Ano pexeso je kompletně pripraveno ke hrani");
        } else {
            System.out.println("V pexesu chybí nebo přebívá dvojce");
        }
        
       double x = PexesoTools.rozhazenost(a);
        
        System.out.println("Prumer vzdalenosti je " + x);
    }
    
    
    private static void vypisMatici(int[][] a, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        for (int[] v : a) {
            for (int h : v) {
                System.out.format("%4d ", h);
            }
            System.out.println("");
        }
    }
    
}
