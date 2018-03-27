package pl.dominisz.defibrillators;

/**
 * http://dominisz.pl
 * 27.03.2018
 */
public class StringUtils {

    //metoda zamienia podany string na typ double
    static double toDouble(String number) {
        return Double.parseDouble(number.replace(',', '.'));
    }

}
