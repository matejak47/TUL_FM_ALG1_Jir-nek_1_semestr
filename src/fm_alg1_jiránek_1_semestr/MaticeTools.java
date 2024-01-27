/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

/**
 *
 * @author matee
 */
public class MaticeTools {

    private MaticeTools() {
    }

    /**
     * Soucet matic.
     *
     * @param a prvni matice
     * @param b druha mmatice
     * @return soucet matic nebo null, pokud nezle soucet vypocitat
     */
    public static double[][] soucetMatic(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) {

            return null;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];

            }

        }
        return result;
    }

    /**
     * Soucin matic.
     *
     * @param a prvni matice
     * @param b druha mmatice
     * @return soucet matic nebo null, pokud nezle soucin vypocitat
     */
    public static double[][] soucinMatic(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        if (b.length != a[0].length) {

            return null;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] maticeTransponovana(double[][] a) {
        double[][] trans = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                trans[j][i] = a[i][j];
            }
        }

        return trans;

    }

    public static double[][] prevedDoNorm(double[][] a) {
        double maxAbsValue = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                double absValue = Math.abs(a[i][j]);
                if (absValue > maxAbsValue) {
                    maxAbsValue = absValue;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] /= maxAbsValue;
            }
        }
        return a;

    }

    // ... 
    // prace s maticemi celych cisel
    public static boolean jeSymetrickaDleDiag(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean jeSymetrickaDleDiag2(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[i][j] != a[a.length - j - 1][a.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean jeSymetrickaDleHorizOsy(int[][] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != a[a.length - i - 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean jeSymetrickaDleVertOsy(int[][] a) {

        for (int i = 0; i < a[0].length / 2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] != a[j][a[0].length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static double [][] jednotkovaMatice(int a){
        double [][] j = new double[a][a];
        
        for (int i = 0; i < a; i++) {
            j [i][i] = 1;
            
        }
    return j;
    }

}
