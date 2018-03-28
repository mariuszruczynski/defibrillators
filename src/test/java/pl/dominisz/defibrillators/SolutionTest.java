package pl.dominisz.defibrillators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * http://dominisz.pl
 * 28.03.2018
 */
public class SolutionTest {

    @Test
    void testFindNearest() {
        User user = new User(new Point(0, 0));
        Defibrillator def1 = Defibrillator.createDefibrillator("1;A;B;C;0;10");
        Defibrillator def2 = Defibrillator.createDefibrillator("2;D;E;F;0;20");
        Defibrillator def3 = Defibrillator.createDefibrillator("3;G;H;I;0;30");
        List<Defibrillator> defibrillators = new ArrayList<>();
        defibrillators.add(def1);
        defibrillators.add(def2);
        defibrillators.add(def3);
        Defibrillator nearest = Solution.findNearest(user, defibrillators);
        assertEquals(nearest, def1);
    }

}
