/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

/**
 *
 * @author matee
 */
public class StringTools {

    private StringTools() {
    }

    public static boolean jePalindrom(String str) {
        boolean je = true;
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i)
                    == str.charAt(str.length() - 1 - i))) {
                je = false;
            }
        }
        return je;
    }

    private static char[] cifry = {'0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * prevede jake koli typy do desitkove soustavy
     *
     * @param cislo cislo ktere chceme prevect
     * @param zaklad z jakeho typu ho prevadime
     * @return
     */
    public static long prevodDoDesitkove(String cislo, byte zaklad) {
        long vysledek = 0;
        char[] soustava = cislo.toCharArray();
        for (int n = 0; n < soustava.length; n++) {
            vysledek += Character.getNumericValue(soustava[soustava.length - 1 - n]) * Math.pow(zaklad, n);
        }
        return vysledek;
    }

    /**
     * Metoda která prevadi z desitkove do jake koli
     *
     * @param cislo cislo ktere chceme prevect do jine soustavy
     * @param zaklad do jake soustavy ho chceme prevect
     * @return vraci string
     */
    public static String prevodZDesitkove(long cislo, byte zaklad) {
        String vysledek = "";
        long temp;
        while (cislo != 0) {

            temp = cislo % zaklad;

            if (temp > 9) {
                vysledek = cifry[(int) temp] + vysledek;
            } else {
                vysledek = temp + vysledek;
            }

            cislo = cislo / zaklad;

        }

        return vysledek;
    }

    /**
     * Sifrovani textu, sifrovat pouze pismena anglicke abecedy. pri sifrovani
     * aplikovat postupne posun definovany jednotlivymi znaky hesla prevedeneho
     * na velka pismena. Posun je dan rozdilem znaku hesla a 'A'. Vsechny
     * nepismenne znaky ignorovat, nezapisovat do vysledku.
     *
     * @param text text
     * @param heslo Textovy retezec obsahujici pouze pismena anglicke abecedy.
     * @return
     */
    public static String sifruj(String text, String heslo) {
        text = text.toUpperCase();
        heslo = heslo.toUpperCase();
        char[] veta = text.toCharArray();
        char[] kod = heslo.toCharArray();
        int temp;
        int max;

        for (int i = 0, n = 0; i < veta.length; i++, n++) {

            if (n == kod.length) {
                n = 0;
            }
            if (veta[i] == ' ') {
                n--;
            } else {
                temp = kod[n] - 'A';
                max = (temp + (int) veta[i]);

                if (max > 90) {
                    veta[i] = (char)(64+(max - 90));
                } else {
                    veta[i] = (char) max;
                }
            }

        }

        return new String(veta);

    }

    /**
     * Desiforvani text vam posune chary v text zpet o rozdil hesla
     * @param text text co ma byt desifrovan
     * @param heslo Textovy retezec obsahujici pouze pismena anglicke abecedy.
     * @return 
     */
    public static String desifruj(String text, String heslo) {
        text = text.toUpperCase();
        heslo = heslo.toUpperCase();
        char[] veta = text.toCharArray();
        char[] kod = heslo.toCharArray();
        int temp;
        int max;

        for (int i = 0, n = 0; i < veta.length; i++, n++) {

            if (n == kod.length) {
                n = 0;
            }
            if (veta[i] == ' ') {
                n--;
            } else {
                temp = kod[n] - 'A';
                max = ((int)veta[i] - temp);

                if (max < 65) {
                    veta[i] = (char) (91-(65-max));
                } else {
                    veta[i] = (char) max;
                }
            }

        }

        return new String(veta);

    }
}
