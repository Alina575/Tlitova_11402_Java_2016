package Task003;

/**
 * @author Alina Tlitova
 *         11-402
 *         003
 */

public class ComplexVector2D {
    private ComplexNumber a, b;

    public ComplexNumber getA() {
        return a;
    }

    public ComplexNumber getB() {
        return b;
    }

    public ComplexVector2D() {
        a = new ComplexNumber();
        b = new ComplexNumber();
    }

    public ComplexVector2D(ComplexNumber a, ComplexNumber b) {
        this.a = a;
        this.b = b;
    }

    public ComplexVector2D add(ComplexVector2D cv) {
        return new ComplexVector2D(a.add(cv.a), b.add(cv.b));
    }

    public String toString() {
        return "<" + a + ", " + b + ">";
    }

    public ComplexNumber scalarProduct(ComplexVector2D cv) {
        ComplexNumber rf = a.mult(cv.a);
        ComplexNumber rf1 = b.mult(cv.b);
        return rf.add(rf1);
    }

    boolean equals(ComplexVector2D cv) {
        if (cv.a == a & cv.b == b)
            return true;
        return false;
    }
}
