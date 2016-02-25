package Task002;

import org.junit.*;
import org.junit.Test;

/**
 * @author Alina Tlitova
 *         11-402
 *         002
 */

public class Matrix2x2Test {
    private final double EPS = 1e-9;

    @Test
    public void matrixShouldHaveSize2x2() {
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(2, m.getA().length, EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZerosEverywhere() {
        Matrix2x2 m = new Matrix2x2();
        for (int i = 0; i < m.getA().length; i++) {
            for (int j = 0; j < m.getA().length; j++) {
                Assert.assertEquals(0, m.getA()[i][j], EPS);
            }
        }
    }

    @Test
    public void matrixShouldHaveTheSameNumberEverywhere() {
        Matrix2x2 m = new Matrix2x2(5);
        for (int i = 0; i < m.getA().length; i++) {
            for (int j = 0; j < m.getA().length; j++) {
                Assert.assertEquals(5, m.getA()[i][j], EPS);
            }
        }
    }

    @Test
    public void matrixShouldHaveSameValues() {
        double[][] a = new double[2][2];
        Matrix2x2 m = new Matrix2x2(a);
        for (int i = 0; i < m.getA().length; i++) {
            for (int j = 0; j < m.getA().length; j++) {
                Assert.assertEquals(0, m.getA()[i][j], EPS);
            }
        }
    }

    @Test
    public void matrixShouldBeDefinedMatrix() {
        double[][] a = new double[2][2];
        Matrix2x2 m = new Matrix2x2(a);
        for (int i = 0; i < m.getA().length; i++) {
            for (int j = 0; j < m.getA().length; j++) {
                Assert.assertEquals(0, m.getA()[i][j], EPS);
            }
        }
    }

    @Test
    public void matrixShouldHaveDefinedValues() {
        Matrix2x2 m = new Matrix2x2(3, 5, 1, 7);
        Assert.assertEquals(3, m.getA()[0][0], EPS);
        Assert.assertEquals(5, m.getA()[0][1], EPS);
        Assert.assertEquals(1, m.getA()[1][0], EPS);
        Assert.assertEquals(7, m.getA()[1][1], EPS);
    }

    @Test
    public void matrixSumShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(5, 6, 11, 9);
        Assert.assertEquals(true, res.equals(m1.add(m2)));
    }

    @Test
    public void matrixSumVoidShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(5, 6, 11, 9);
        m1.add2(m2);
        Assert.assertEquals(true, res.equals(m1));
    }

    @Test
    public void matrixSubShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(-1, -4, -3, 7);
        Assert.assertEquals(true, res.equals(m1.sub(m2)));
    }

    @Test
    public void matrixSubVoidShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(-1, -4, -3, 7);
        m1.sub2(m2);
        Assert.assertEquals(true, res.equals(m1));
    }

    @Test
    public void matrixMultNumberShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 res = new Matrix2x2(6, 3, 12, 24);
        Assert.assertEquals(true, res.equals(m1.multNumber(3)));
    }

    @Test
    public void matrixMultNumberVoidShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 res = new Matrix2x2(6, 3, 12, 24);
        m1.multNumber2(3);
        Assert.assertEquals(true, res.equals(m1));
    }

    @Test
    public void matrixMultShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(13, 11, 68, 28);
        Assert.assertEquals(true, res.equals(m1.mult(m2)));
    }

    @Test
    public void matrixMultVoidShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 m2 = new Matrix2x2(3, 5, 7, 1);
        Matrix2x2 res = new Matrix2x2(13, 11, 68, 28);
        m1.mult2(m2);
        Assert.assertEquals(true, res.equals(m1));
    }

    @Test
    public void matrixDetShouldBeCorrect() {
        Matrix2x2 m = new Matrix2x2(2, 1, 4, 8);
        Assert.assertEquals(12, m.det(), EPS);
    }

    @Test
    public void matrixTransponShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 res = new Matrix2x2(2, 4, 1, 8);
        m1.transpon();
        Assert.assertEquals(true, res.equals(m1));
    }

    @Test
    public void matrixInverseShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Matrix2x2 res = new Matrix2x2(2, -5 / 2, -1, 3 / 2);
        Assert.assertEquals(true, res.equals(m1.inverseMatrix()));
    }

    @Test
    public void matrixMultVectorShouldBeCorrect() {
        Matrix2x2 m1 = new Matrix2x2(2, 1, 4, 8);
        Vector2D v = new Vector2D(2, 3);
        Vector2D res = new Vector2D(7, 32);
        Assert.assertEquals(true, res.equals(m1.multVector(v)));
    }
}


