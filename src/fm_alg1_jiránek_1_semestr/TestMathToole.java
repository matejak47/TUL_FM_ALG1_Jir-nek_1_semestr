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
public class TestMathToole {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej X");
        double x = sc.nextDouble();
        System.out.println("Zadej toleranci");
        double eps = sc.nextDouble();
        double mocnina1 = MathTools.mocnina(x, 2);
        double mocnina2 = Math.pow(x, 2);
        double sin1 = MathTools.sin(Math.toRadians(x), eps);
        double sin2 = Math.sin(Math.toRadians(x));
        double sqrt1 = MathTools.sqrt(x, eps);
        double sqrt2 = Math.sqrt(x);
        double qbrt1 = MathTools.qbrt(x, eps);
        double qbrt2 = Math.cbrt(x);
        double cosin1 = MathTools.cos(Math.toRadians(x), eps);
        double cosin2 = Math.cos(Math.toRadians(x));
        double log1 = MathTools.log(x,eps);
        double log2 = Math.log(x);
        System.out.format("Vypočet mocniny %.3f %.3f \n", mocnina1, mocnina2);
        System.out.format("Vypočet sinu %.2f %.2f\n", sin1, sin2);
        System.out.format("Vypočet odmocniny %f %f \n",sqrt1,sqrt2);
        System.out.format("Vypočet treti odmocniny %f %f\n", qbrt1,qbrt2);
        System.out.format("Vypocet cosinu %f %f\n",cosin1,cosin2);
        System.out.format("Vypocet log %f %f\n",log1,log2);

    }

}
