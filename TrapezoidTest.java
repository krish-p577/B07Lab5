import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void testPerimeter() {
        Trapezoid t = new Trapezoid(8, 5, 3, 4, 6);
        assertEquals(20.0, t.getPerimeter(), 0.001);
    }

    @Test
    void testArea() {
        Trapezoid t = new Trapezoid(8, 5, 3, 4, 6);
        assertEquals(39.0, t.getArea(), 0.001);
    }
}
