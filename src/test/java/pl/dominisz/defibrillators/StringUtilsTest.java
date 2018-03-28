package pl.dominisz.defibrillators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * http://dominisz.pl
 * 28.03.2018
 */
class StringUtilsTest {

    @Test
    void toDouble() {
        String str = "178,94";
        double result = StringUtils.toDouble(str);

        assertEquals(178.94, result);
    }
}