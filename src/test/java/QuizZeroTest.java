import org.junit.Test;

import static org.junit.Assert.*;

public class QuizZeroTest {

    @Test
    public void qzero() {
        assertEquals(0, QuizZero.Qzero(5, 6));
        assertEquals(0, QuizZero.Qzero(3, -96));
    }

    @Test
    public void qone() {
        assertEquals(4, QuizZero.Qone(2, 2));
        assertEquals(5, QuizZero.Qone(3, 2));
        assertEquals(0, QuizZero.Qone(5, -5));
        assertEquals(1000, QuizZero.Qone(200, 800));

    }

    @Test
    public void qtwo() {
        assertEquals(4, QuizZero.Qtwo(2, 2));
        assertEquals(6, QuizZero.Qtwo(3, 2));
        assertEquals(30, QuizZero.Qtwo(5, 6));
        assertEquals(33, QuizZero.Qtwo(11, 3));
    }

    @Test
    public void qthree() {
        assertEquals(0, QuizZero.Qthree(2, 2));
        assertEquals(1, QuizZero.Qthree(2, 3));
        assertEquals(2, QuizZero.Qthree(75, 77));
        assertEquals(9, QuizZero.Qthree(2, 11));
        assertEquals(-14, QuizZero.Qthree(-3, -17));
    }

    @Test
    public void qfour() {
        assertEquals(0, QuizZero.Qfour(0));
        assertEquals(-1, QuizZero.Qfour(1));
        assertEquals(2, QuizZero.Qfour(-2));
    }

    @Test
    public void qfive() {
        assertEquals(4, QuizZero.Qfive(2, 2));
        assertEquals(4, QuizZero.Qfive(2, 3));
        assertEquals(150, QuizZero.Qfive(75, 77));
        assertEquals(6, QuizZero.Qfive(3, 3));
        assertEquals(2, QuizZero.Qfive(1, 1));
    }

    @Test
    public void qsix() {
        assertEquals(0, QuizZero.Qsix(0));
        assertEquals(1, QuizZero.Qsix(1));
        assertEquals(8, QuizZero.Qsix(2));
        assertEquals(125, QuizZero.Qsix(5));
        assertEquals(27, QuizZero.Qsix(3));
        assertEquals(-8, QuizZero.Qsix(-2));
    }

    @Test
    public void qseven() {
        assertEquals(0, QuizZero.Qseven(4, 2));
        assertEquals(3, QuizZero.Qseven(13, 10));
        assertEquals(1, QuizZero.Qseven(13, 6));
        assertEquals(0, QuizZero.Qseven(4, 2));
        assertEquals(1, QuizZero.Qseven(5, 2));
    }

    @Test
    public void qeight() {
        assertEquals(3, QuizZero.Qeight(4, 3, 2));
        assertEquals(4, QuizZero.Qeight(13, 10, 5));
        assertEquals(3, QuizZero.Qeight(12, 6, 6));
        assertEquals(2, QuizZero.Qeight(4, 2, 3));
        assertEquals(7, QuizZero.Qeight(5, 2, 1));

    }

    @Test
    public void qnine() {
        assertEquals(13, QuizZero.Qnine(4, 2));
        assertEquals(135, QuizZero.Qnine(13, 10));
        assertEquals(50, QuizZero.Qnine(5, 9));
        assertEquals(17, QuizZero.Qnine(4, 3));
        assertEquals(15, QuizZero.Qnine(5, 2));
    }

    @Test
    public void qaay() {
        assertEquals(false, QuizZero.Qaay(false, false));
        assertEquals(false, QuizZero.Qaay(true, false));
        assertEquals(false, QuizZero.Qaay(false, true));
        assertEquals(true, QuizZero.Qaay(true, true));
    }

    @Test
    public void qbee() {
        assertEquals(false, QuizZero.Qbee(false, false));
        assertEquals(true, QuizZero.Qbee(true, false));
        assertEquals(true, QuizZero.Qbee(false, true));
        assertEquals(true, QuizZero.Qbee(true, true));
    }

    @Test
    public void qcee() {
        assertEquals(-2, QuizZero.Qcee(true, true));
        assertEquals(1, QuizZero.Qcee(false, true));
        assertEquals(1, QuizZero.Qcee(true, false));
        assertEquals(-2, QuizZero.Qcee(false, false));
    }

    @Test
    public void qdee() {
        assertEquals(1.0, QuizZero.Qdee(4.0f, 2), 0.00001);
        assertEquals(0.0, QuizZero.Qdee(0.0f, 101), 0.00001);
        assertEquals(0.333333, QuizZero.Qdee(3.0f, 3), 0.00001);
        assertEquals(4.0, QuizZero.Qdee(64.0f, 4), 0.00001);
        assertEquals(1.25, QuizZero.Qdee(5.0f, 2), 0.00001);
    }

    @Test
    public void qeee() {
        assertEquals(0, QuizZero.Qeee(5.0, 5.0));
        assertEquals(1, QuizZero.Qeee(5.1, 5.2));
        assertEquals(0, QuizZero.Qeee(5.0004, 5.0004));
        assertEquals(0, QuizZero.Qeee(0.000004, 0.000006));
        assertEquals(1, QuizZero.Qeee(7.56, 4567.3));
    }

    @Test
    public void qeff() {
        assertEquals(0, QuizZero.Qeff(0));
        assertEquals(0, QuizZero.Qeff(1));
        assertEquals(0, QuizZero.Qeff(4));
        assertEquals(0, QuizZero.Qeff(9));
        assertEquals(0, QuizZero.Qeff(176281683));
    }
}