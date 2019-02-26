package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    static final double  DELTA = 0.000001;

    @Test
    public void getRealPart() {
    }

    @Test
    public void setRealPart() {
    }

    @Test
    public void getImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart, DELTA);
    }

    @Test
    public void setImagPart() {
    }

    @Test  // (4.5 +6.0)+(3.0i + 4.0i) = 10.5 + 7.0i
    public void add() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals(10.5, cn1.getRealPart(), DELTA);
        assertEquals(7.0, cn1.getImagPart(),DELTA);
    }

    @Test
    public void sub() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 3.0);
        ComplexNumber cn2 = new ComplexNumber(2.0, 1.0);
        cn1.sub(cn2);
        assertEquals(1.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(),DELTA);
    }

    @Test
    public void mult() {
        ComplexNumber cn1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 4.0);
        cn1.add(cn2);
        assertEquals(-5.0, cn1.getRealPart(), DELTA);
        assertEquals(10.0, cn1.getImagPart(),DELTA);
    }

    @Test
    public void div() {
        ComplexNumber cn1 = new ComplexNumber(1.0,1.0);
        ComplexNumber cn2 = new ComplexNumber(1.0,1.0);
        cn1.div(cn2);
        assertEquals(1.0, cn1.getRealPart(),DELTA);
        assertEquals(0.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void conj() {
    }
}