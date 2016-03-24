package kpfu.itis;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.mockito.Mockito.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         009
 */

public class ComplexMatrix2x2Test {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static ComplexMatrix2x2 cm = (ComplexMatrix2x2) ac.getBean("cm");

    @Test
    public void matrixShouldHaveSize2x2() {
        ComplexMatrix2x2 cm1 = (ComplexMatrix2x2) ac.getBean("cmDef");
        Assert.assertEquals(2, cm1.getA().length, 1e-9);
    }

    @Test
    public void defaultMatrixShouldHaveZerosEverywhere() {
        ComplexMatrix2x2 cm1 = (ComplexMatrix2x2) ac.getBean("cmDef");
        ComplexNumber cn = mock(ComplexNumber.class);
        for (int i = 0; i < cm1.getA().length; i++) {
            for (int j = 0; j < cm1.getA().length; j++) {
                Assert.assertTrue(cn.getVal() == cm1.getA()[i][j].getVal());
                Assert.assertTrue(cn.getImag() == cm1.getA()[i][j].getImag());
            }
        }
    }

    @Test
    public void matrixShouldHaveTheSameNumberEverywhere() {
        ComplexMatrix2x2 cm1 = (ComplexMatrix2x2) ac.getBean("cm1");
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getVal()).thenReturn(2.0);
        when(cn.getImag()).thenReturn(1.0);
        for (int i = 0; i < cm1.getA().length; i++) {
            for (int j = 0; j < cm1.getA().length; j++) {
                Assert.assertEquals(true, cn.getVal() == (cm1.getA()[i][j]).getVal());
                Assert.assertEquals(true, cn.getImag() == (cm1.getA()[i][j]).getImag());
            }
        }
    }

    @Test
    public void matrixShouldHaveDefinedValues() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn1.getVal()).thenReturn(3.0);
        when(cn1.getImag()).thenReturn(1.0);
        when(cn2.getVal()).thenReturn(2.0);
        when(cn2.getImag()).thenReturn(3.0);
        when(cn3.getVal()).thenReturn(5.0);
        when(cn3.getImag()).thenReturn(2.0);
        when(cn4.getVal()).thenReturn(5.0);
        when(cn4.getImag()).thenReturn(8.0);
        Assert.assertEquals(true, cn1.getVal() == (cm.getA()[0][0].getVal()));
        Assert.assertEquals(true, cn1.getImag() == (cm.getA()[0][0].getImag()));
        Assert.assertEquals(true, cn2.getVal() == (cm.getA()[0][1].getVal()));
        Assert.assertEquals(true, cn2.getImag() == (cm.getA()[0][1].getImag()));
        Assert.assertEquals(true, cn3.getVal() == (cm.getA()[1][0].getVal()));
        Assert.assertEquals(true, cn3.getImag() == (cm.getA()[1][0].getImag()));
        Assert.assertEquals(true, cn4.getVal() == (cm.getA()[1][1].getVal()));
        Assert.assertEquals(true, cn4.getImag() == (cm.getA()[1][1].getImag()));
    }

    @Test
    public void complexMatrixSumShouldBeCorrect() {
        ComplexMatrix2x2 cm1 = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 res = (ComplexMatrix2x2) ac.getBean("sumRes");
        when(cm1.getA()[0][0].getVal()).thenReturn(5.0);
        when(cm1.getA()[0][0].getImag()).thenReturn(2.0);
        when(cm1.getA()[0][1].getVal()).thenReturn(3.0);
        when(cm1.getA()[0][1].getImag()).thenReturn(6.0);
        when(cm1.getA()[1][0].getVal()).thenReturn(9.0);
        when(cm1.getA()[1][0].getImag()).thenReturn(4.0);
        when(cm1.getA()[1][1].getVal()).thenReturn(10.0);
        when(cm1.getA()[1][1].getImag()).thenReturn(15.0);
        Assert.assertEquals(true, res.equals(cm.add(cm1)));
    }

    @Test
    public void complexMatrixMultShouldBeCorrect() {
        ComplexMatrix2x2 cm1 = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 res = (ComplexMatrix2x2) ac.getBean("multRes");
        when(cm1.getA()[0][0].getVal()).thenReturn(5.0);
        when(cm1.getA()[0][0].getImag()).thenReturn(2.0);
        when(cm1.getA()[0][1].getVal()).thenReturn(3.0);
        when(cm1.getA()[0][1].getImag()).thenReturn(6.0);
        when(cm1.getA()[1][0].getVal()).thenReturn(9.0);
        when(cm1.getA()[1][0].getImag()).thenReturn(4.0);
        when(cm1.getA()[1][1].getVal()).thenReturn(10.0);
        when(cm1.getA()[1][1].getImag()).thenReturn(15.0);
        Assert.assertEquals(true, res.equals(cm.mult(cm1)));
    }

    @Test
    public void complexMatrixDetShouldBeCorrect() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getVal()).thenReturn(3.0);
        when(cn.getImag()).thenReturn(10.0);
        Assert.assertEquals(true, cm.det().getVal() == cn.getVal());
        Assert.assertEquals(true, cm.det().getImag() == cn.getImag());
    }

    @Test
    public void complexMatrixMultVectorShouldBeCorrect() {
        ComplexVector2D res = (ComplexVector2D) ac.getBean("multVecto2DRes");
        ComplexNumber cn = (ComplexNumber) ac.getBean("cn6");
        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getA()).thenReturn(cn);
        when(cv.getB()).thenReturn(cn);
        Assert.assertEquals(true, res.equals(cm.multVector(cv)));
    }
}
