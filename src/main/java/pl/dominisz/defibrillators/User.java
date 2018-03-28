package pl.dominisz.defibrillators;

/**
 * http://dominisz.pl
 * 27.03.2018
 */
public class User {

    private Point location;

    public User(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

}
