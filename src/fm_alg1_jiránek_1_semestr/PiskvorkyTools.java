/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

/**
 *
 * @author matee
 */
public class PiskvorkyTools {

    private PiskvorkyTools() {
    }

    /**
     * Zjisti pocet stejnych hodnot v souvisle radkove rade od pocetecni pozice.
     *
     * @param a matice celych cisel
     * @param r radkovy index
     * @param s sloupcovy index
     * @return
     */
    public static int pocetStejnychVRadce(int[][] a, int r, int s) {
        int pocet = 1;
        int znak = a[r][s];
        for (int i = s + 1; i < a[r].length; i++) {
            if (znak != a[r][i]) {
                break;
            }
            pocet++;
        }
        for (int i = s - 1; i >= 0; i--) {
            if (znak != a[r][i]) {
                break;
            }
            pocet++;
        }

        return pocet;
    }

    /**
     * Zjisti pocet stejnych hodnot v souvislem sloupcovem sloupci od pocetecni
     * pozice.
     *
     * @param a matice celych cisel
     * @param r radkovy index
     * @param s sloupcovy index
     * @return
     */
    public static int pocetStejnychVSloupci(int[][] a, int r, int s) {
        int pocet = 1;
        int znak = a[r][s];
        for (int i = r + 1; i < a.length; i++) {
            if (znak != a[i][s]) {
                break;
            }
            pocet++;
        }
        for (int i = r - 1; i >= 0; i--) {
            if (znak != a[i][s]) {
                break;
            }
            pocet++;
        }

        return pocet;
    }

    /**
     * Zjisti pocet stejnych hodnot v souvisle diagonalove diagonale od
     * pocetecni pozice.
     *
     * @param a matice celych cisel
     * @param r radkovy index
     * @param s sloupcovy index
     * @return
     */
    public static int pocetStejnychVDiag1(int[][] a, int r, int s) {
        int pocet = 1;
        int znak = a[r][s];
        for (int i = r - 1, j = s - 1; (i >= 0 && j >= 0); i--, j--) {
            if (znak != a[i][j]) {
                break;
            }
            pocet++;
        }
        for (int i = r + 1, j = s + 1; (i < a.length && j < a[0].length); i++, j++) {
            if (znak != a[i][j]) {
                break;
            }
            pocet++;
        }
        return pocet;
    }

    /**
     * Zjisti pocet stejnych hodnot v souvisle antidiagonnalove diagonale od
     * pocetecni pozice.
     *
     * @param a matice celych cisel
     * @param r radkovy index
     * @param s sloupcovy index
     * @return
     */
    public static int pocetStejnychVDiag2(int[][] a, int r, int s) {
        int pocet = 1;
        int znak = a[r][s];
        for (int i = r - 1, j = s + 1; (j < a[0].length && i >= 0); i--, j++) {
            if (znak != a[i][j]) {
                break;
            }
            pocet++;
        }
        for (int i = r + 1, j = s - 1; (j >= 0 && i < a.length); i++, j--) {
            if (znak != a[i][j]) {
                break;
            }
            pocet++;
        }

        return pocet;
    }

}
