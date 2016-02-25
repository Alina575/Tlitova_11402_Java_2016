package Task002;

/**
 * @author Tlitova Alina
 *         11-402
 *         002
 */

public class Matrix2x2 {
    private double[][] a = new double[2][2];

    public double[][] getA() {
        return a;
    }

    public Matrix2x2() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                this.a[i][j] = 0;
            }
        }
    }

    public Matrix2x2(double k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = k;
            }
        }
    }

    public Matrix2x2(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                this.a[i][j] = a[i][j];
            }
        }
    }

    public Matrix2x2(double a, double b, double c, double d) {
        this.a[0][0] = a;
        this.a[0][1] = b;
        this.a[1][0] = c;
        this.a[1][1] = d;
    }

    public Matrix2x2 add(Matrix2x2 b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] += b.getA()[i][j];
            }
        }
        return new Matrix2x2(a);
    }

    public void add2(Matrix2x2 b) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                a[i][j] += b.getA()[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] -= b.getA()[i][j];
            }
        }
        return new Matrix2x2(a);
    }

    public void sub2(Matrix2x2 b) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                a[i][j] -= b.getA()[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double s) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] *= s;
            }
        }
        return new Matrix2x2(a);
    }

    public void multNumber2(double s) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                a[i][j] *= s;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.getA().length; j++) {
                for (int k = 0; k < b.getA().length; k++) {
                    a[i][j] += a[i][k] * b.getA()[k][j];
                }
            }
        }
        return new Matrix2x2(a);
    }

    public void mult2(Matrix2x2 b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.getA().length; j++) {
                for (int k = 0; k < b.getA().length; k++) {
                    a[i][j] += a[i][k] * b.getA()[k][j];
                }
            }
        }
    }

    public double det() {
        return a[0][0] * a[1][1] - a[1][0] * a[0][1];
    }

    public void transpon() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                double k = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = k;
            }
        }
    }

    public Matrix2x2 inverseMatrix() {
        double[][] c = new double[2][2];
        double t;
        if (this.det() == 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = 0;
                }
            }
            System.out.println("Обратной матрицы не существует!");
        }
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;
                if (i == j)
                    a[i][j] = 1;
            }
        for (int k = 0; k < a.length; k++) {
            t = c[k][k];
            for (int j = 0; j < a.length; j++) {
                c[k][j] /= t;
                a[k][j] /= t;
            }
            for (int i = k + 1; i < a.length; i++) {
                t = c[i][k];
                for (int j = 0; j < a.length; j++) {
                    c[i][j] -= c[k][j] * t;
                    a[i][j] -= a[k][j] * t;
                }
            }
        }
        for (int k = a.length - 1; k > 0; k--) {
            for (int i = k - 1; i >= 0; i--) {
                t = c[i][k];
                for (int j = 0; j < a.length; j++) {
                    c[i][j] -= c[k][j] * t;
                    a[i][j] -= a[k][j] * t;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                c[i][j] = a[i][j];
        return new Matrix2x2(c);
    }

    public Vector2D multVector(Vector2D v) {
        double x, y;
        x = v.getX() * a[0][0] + v.getY() * a[0][1];
        y = v.getX() * a[1][0] + v.getY() * a[1][1];
        return new Vector2D(x, y);
    }

    public boolean equals(Matrix2x2 m) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (m.getA()[i][j] != a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

