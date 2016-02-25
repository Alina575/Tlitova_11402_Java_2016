package Task002;

/**
 * @author Alina Tlitova
 *         11-402
 *         002
 */

public class Vector2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2D() {
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.getX(), y + v.getY());
    }

    public Vector2D mult(double c) {
        return new Vector2D(x * c, y * c);
    }

    public boolean equals(Vector2D v) {
        if (v.getX() == x && v.getY() == y) {
            return true;
        } else {
            return false;
        }
    }
}
