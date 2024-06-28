import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testEquilateral1() {
        assertEquals(0, Testing.triangle(5, 5, 5));
    }

    @Test
    public void testEquilateral2() {
        assertEquals(0, Testing.triangle(10, 10, 10));
    }

    @Test
    public void testIsosceles1() {
        assertEquals(1, Testing.triangle(5, 5, 3));
    }

    @Test
    public void testIsosceles2() {
        assertEquals(1, Testing.triangle(4, 6, 6));
    }

    @Test
    public void testIsosceles3() {
        assertEquals(1, Testing.triangle(7, 7, 5));
    }

    @Test
    public void testIsosceles4() {
        assertEquals(1, Testing.triangle(8, 5, 8));
    }

    @Test
    public void testScalene1() {
        assertEquals(2, Testing.triangle(4, 5, 6));
    }

    @Test
    public void testScalene2() {
        assertEquals(2, Testing.triangle(5, 7, 8));
    }

    @Test
    public void testScalene3() {
        assertEquals(2, Testing.triangle(9, 12, 14));
    }

    @Test
    public void testInvalid1() {
        assertEquals(3, Testing.triangle(1, 10, 12));
    }

    @Test
    public void testInvalid2() {
        assertEquals(3, Testing.triangle(10, 1, 12));
    }

    @Test
    public void testInvalid3() {
        assertEquals(3, Testing.triangle(10, 12, 1));
    }

    @Test
    public void testInvalid4() {
        assertEquals(3, Testing.triangle(1, 2, 3));
    }

    @Test
    public void testInvalid5() {
        assertEquals(3, Testing.triangle(2, 1, 3));
    }

    @Test
    public void testInvalid6() {
        assertEquals(3, Testing.triangle(3, 1, 2));
    }

    @Test
    public void testInvalid7() {
        assertEquals(3, Testing.triangle(1, 3, 2));
    }

    @Test
    public void testInvalid8() {
        assertEquals(3, Testing.triangle(5, 1, 2));
    }

    @Test
    public void testInvalid9() {
        assertEquals(3, Testing.triangle(1, 5, 2));
    }
}