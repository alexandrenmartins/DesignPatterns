package estruturais.adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        System.out.println("RoundHole Radius:" + radius);
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        System.out.println("RoundHole Radius fits:" + result);
        return result;
    }
}
