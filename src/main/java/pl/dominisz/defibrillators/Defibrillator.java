package pl.dominisz.defibrillators;

/**
 * http://dominisz.pl
 * 27.03.2018
 */
public class Defibrillator {

    private int number;
    private String name;
    private String address;
    private String phoneNumber;
    private Point location;

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    static Defibrillator createDefibrillator(String description) {
        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.address = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(StringUtils.toDouble(tokens[4]),
                StringUtils.toDouble(tokens[5]));
        return defibrillator;
    }

}
