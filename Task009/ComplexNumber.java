package kpfu.itis;

import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         009
 */

@Component
public class ComplexNumber {
    private double val;
    private double imag;

    public double getVal() {
        return val;
    }

    public double getImag() {
        return imag;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double a, double b) {
        this.val = a;
        this.imag = b;
    }

    public ComplexNumber add(ComplexNumber k) {
        return new ComplexNumber(val + k.getVal(), (imag + k.getImag()));
    }

    public void add2(ComplexNumber k) {
        this.val = val + k.getVal();
        this.imag = (imag + k.getImag());
        String s = this.toString();
        System.out.println(s);
    }

    public ComplexNumber sub(ComplexNumber k) {
        return new ComplexNumber(val - k.getVal(), (imag - k.getImag()));
    }

    public void sub2(ComplexNumber k) {
        this.val -= k.getVal();
        this.imag = (imag - k.getImag());
        String s = this.toString();
        System.out.println(s);
    }

    public ComplexNumber multNumber(double n) {
        return new ComplexNumber(val * n, imag * n);
    }

    public void multNumber2(double m) {
        this.val *= m;
        imag *= m;
        String s = this.toString();
        System.out.println(s);
    }

    public ComplexNumber mult(ComplexNumber k) {
        return new ComplexNumber(val * k.getVal() - imag * k.getImag(), (imag * k.getVal() + val * k.getImag()));
    }

    public void mult2(ComplexNumber k) {
        this.val = val * k.getVal() - imag * k.getImag();
        this.imag = (imag * k.getVal() + val * k.getImag());
        String s = this.toString();
        System.out.println(s);
    }

    public ComplexNumber div(ComplexNumber k) {
        return new ComplexNumber((val * k.getVal() + imag * k.getImag()) / (k.getVal() * k.getVal() + k.getImag() * k.getImag()),
                ((imag * k.getVal() - val * k.getImag()) / (k.getVal() * k.getVal() + k.getImag() * k.getImag())));
    }

    public void div2(ComplexNumber k) {
        this.val = (val * k.getVal() + imag * k.getImag()) / (k.getVal() * k.getVal() + k.getImag() * k.getImag());
        this.imag = (imag * k.getVal() - val * k.getImag()) / (k.getVal() * k.getVal() + k.getImag() * k.getImag());
        String s = this.toString();
        System.out.println(s);
    }

    public double length() {
        return Math.sqrt(val * val + imag * imag);
    }

    public String toString() {
        if (imag > 0)
            return val + "+" + imag;
        return val + "" + imag;
    }

    public boolean equals(ComplexNumber k) {
        if (val == k.getVal() & imag == k.getImag())
            return true;
        return false;
    }
}
