package pl.dominisz.defibrillators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://dominisz.pl
 * 27.03.2018
 */
public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();

        Point userLocation = new Point(StringUtils.toDouble(LON), StringUtils.toDouble(LAT));
        User user = new User(userLocation);

        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<Defibrillator> defibrillators = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            Defibrillator defibrillator = Defibrillator.createDefibrillator(DEFIB);
            defibrillators.add(defibrillator);
        }
        Defibrillator nearest = findNearest(user, defibrillators);
        System.out.println(nearest.name);
    }

    static Defibrillator findNearest(User user,
                                     List<Defibrillator> defibrillators) {
        Defibrillator minDefibrillator = defibrillators.get(0);
        double minDistance = user.location
                .distanceTo(minDefibrillator.location);
        for (int i = 1; i < defibrillators.size(); i++) {
            double distance = user.location
                    .distanceTo(defibrillators.get(i).location);
            if (distance < minDistance) {
                minDistance = distance;
                minDefibrillator = defibrillators.get(i);
            }
        }
        return minDefibrillator;
    }

}
