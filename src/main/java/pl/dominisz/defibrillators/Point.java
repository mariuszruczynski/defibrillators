package pl.dominisz.defibrillators;

/**
 * http://dominisz.pl
 * 27.03.2018
 */
public class Point {

    private final double EARTH_RADIUS = 6371.0;

    private double longitude;
    private double latitude;

    public Point(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double distanceTo(Point B) {
        double x = (B.longitude - longitude) * Math.cos((latitude + B.latitude) / 2);
        double y = B.latitude - latitude;
        double d = Math.sqrt(x * x + y * y) * EARTH_RADIUS;
        return d;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return latitude == point.latitude
                    && longitude == point.longitude;
        } else {
            return false;
        }
    }
}
