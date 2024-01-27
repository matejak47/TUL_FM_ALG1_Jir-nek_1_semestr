/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

/**
 *
 * @author matee
 */
public final class MathTools {

    private MathTools() {
    }

    public static double mocnina(double a, int n) {
        double vysledek = 1;
        int z = n;
        n = Math.abs(n);
        for (int i = 1; i <= n; i++) {
            vysledek *= a;
        }
        if (z >= 0) {
            return vysledek;
        } else {
            return 1 / vysledek;
        }

    }

    public static double sin(double x, double eps) {
        double temp = x;
        double vysledek = 0;
        boolean znamenko = true;
        for (int i = 1; Math.abs(temp) > eps; i += 2) {

            if (i != 1) {
                temp *= (x * x) / (i * (i - 1));
            }
            if (Math.abs(temp) < eps) {
                break;
            }
            if (znamenko) {
                vysledek += temp;
                znamenko = false;
            } else {
                vysledek -= temp;
                znamenko = true;
            }

        }
        return vysledek;

    }

    public static double cos(double x, double eps) {
        double temp = 1;
        double vysledek = 0;
        boolean znamenko = true;
        for (int i = 0; Math.abs(temp) > eps; i += 2) {

            if (i != 0) {
                temp *= (x * x) / (i * (i - 1));
            }
            if (Math.abs(temp) < eps) {
                break;
            }
            if (znamenko) {
                vysledek += temp;
                znamenko = false;
            } else {
                vysledek -= temp;
                znamenko = true;
            }

        }
        return vysledek;


    }

    public static double log(double x,double eps) {
        double citatel;
        double jmenovatel;
        double vysledek = 0;
        double temp = 1;
        
        for (int i = 1; temp > eps; i+=2) {
            
            citatel = mocnina((x-1),i);
            jmenovatel = i * mocnina((x+1),i);
            vysledek += citatel/jmenovatel;
            temp = citatel/jmenovatel;
            
        }
        vysledek *= 2;
        
        
        return vysledek;

    }

    public static double sqrt(double x, double eps) {
        double current = x;
        double temp = 0;
        double diff = 0;
        do{
            temp = current;
            current = 0.5 * ((x/current)+current);
            diff = Math.abs(current - temp);
            
        
        }while(diff>eps);
        
        
        
        return current;
    }

    public static double qbrt(double x, double eps) {
        
            double cislo = x;
            double predchoziX;

            do {
                predchoziX = x;
                x = (2 * x + cislo / (x * x)) / 3;
            } while (Math.abs(x - predchoziX) > eps);

            return x;
    }

    public static int fakt(int x) {
        int vysledek = 1;
        for (int i = 1; i <= x; i++) {
            vysledek *= i;
        }
        return vysledek;

    }
}
