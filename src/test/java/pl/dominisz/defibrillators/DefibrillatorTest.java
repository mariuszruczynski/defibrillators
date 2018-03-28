package pl.dominisz.defibrillators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * http://dominisz.pl
 * 28.03.2018
 */
class DefibrillatorTest {

    @Test
    void createDefibrillator() {
        Defibrillator actualDefibrillator
                = Defibrillator.createDefibrillator("1;A;B;C;1,1;2,2");
        assertEquals(1, actualDefibrillator.getNumber());
        assertEquals("A", actualDefibrillator.getName());
        assertEquals("B", actualDefibrillator.getAddress());
        assertEquals("C", actualDefibrillator.getPhoneNumber());
        assertEquals(new Point(1.1, 2.2), actualDefibrillator.getLocation());
    }

}