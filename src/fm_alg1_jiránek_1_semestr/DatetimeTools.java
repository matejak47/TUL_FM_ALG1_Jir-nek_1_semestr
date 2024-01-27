/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

/**
 *
 * @author matee
 */
public class DatetimeTools {

    public static boolean jePrestupnyRok(int rok) {
        boolean jePrestupny = rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0);

        return jePrestupny;
    }

    public static boolean jePlatneDatun(int den, int mes, int rok) {
        boolean day = false;
        boolean month = false;
        boolean year = false;
        boolean platne = false;
        boolean prestup = jePrestupnyRok(rok);

        if (rok > 0) {
            year = true;
        }
        if (mes > 0 && mes < 13) {
            month = true;
        }

        if (mes == 2) {
            if ((prestup && den <= 29 && den >= 1) || (!prestup && den <= 28 && den >= 1)) {
                day = true;

            } else {
                day = false;
            }

        } else {
            if (mes > 7 && mes < 13) {
                if (mes % 2 == 0) {
                    if (den > 31 || den < 1) {
                        day = false;
                    } else {
                        day = true;
                    }

                } else if (mes % 2 != 0) {

                    if (den > 30 || den < 1) {
                        day = false;
                    } else {
                        day = true;
                    }
                }
            } else if (mes > 0 && mes < 8) {
                if (mes % 2 != 0) {
                    if (den > 31 || den < 1) {
                        day = false;
                    } else {
                        day = true;
                    }

                } else if (mes % 2 == 0) {

                    if (den > 30 || den < 1) {
                        day = false;
                    } else {
                        day = true;
                    }
                }
            }

        }

        if (day && month && year) {
            platne = true;

        }

        return platne;
    }

    public static int denTydne(int den, int mes, int rok) {
        int numday = 0;
        int q = den;
        int m;
        int K ;
        int J = rok / 100;

        if (mes == 1 || mes == 2) {
            m = mes + 12;
            K = (rok % 100)-1;
        } else {
            m = mes;
            K = rok % 100;

        }
        
        
        numday = (q + ((13*(m+1))/5)+K+(K/4)+(J/4)-2*J)%7;

        return numday;
    }

}
