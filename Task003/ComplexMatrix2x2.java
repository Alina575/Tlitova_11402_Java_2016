package Task003;

/**
 * @author Alina Tlitova
 *         11-402
 *         003
 */

public class ComplexMatrix2x2 {
    private ComplexNumber[][] a = new ComplexNumber[2][2];

    public ComplexNumber[][] getA() {
        return a;
    }

    public ComplexMatrix2x2() {
        this(new ComplexNumber(), new ComplexNumber(),
                new ComplexNumber(), new ComplexNumber());
    }

    public ComplexMatrix2x2(ComplexNumber cn) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                this.a[i][j] = cn;
            }
        }
    }

    public ComplexMatrix2x2(ComplexNumber cn1, ComplexNumber cn2,
                            ComplexNumber cn3, ComplexNumber cn4) {
        a[0][0] = cn1;
        a[0][1] = cn2;
        a[1][0] = cn3;
        a[1][1] = cn4;
    }

    public ComplexMatrix2x2 add(ComplexMatrix2x2 cm) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                cm.a[i][j] = a[i][j].add(cm.a[i][j]);
            }
        }
        return cm;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 cm) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                cm.a[i][j] = a[i][j].mult(cm.a[i][j]);
            }
        }
        return cm;
    }

    public ComplexNumber det() {
        return (a[0][0].mult(a[1][1])).sub(a[1][0].mult(a[0][1]));
    }

    public ComplexVector2D multVector(ComplexVector2D cv) {
        ComplexNumber x, y;
        x = (cv.getA().mult(a[0][0])).add(cv.getB().mult(a[0][1]));
        y = (cv.getA().mult(a[1][0])).add(cv.getB().mult(a[1][1]));
        return new ComplexVector2D(x, y);
    }

    public boolean equals(ComplexMatrix2x2 cm) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (cm.getA()[i][j] != a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
