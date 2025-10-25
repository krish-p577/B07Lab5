package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class test {
	@Test
	void R_l() {
        Rectangle r1 = new Rectangle(1.0,2.0);
        assertEquals(1.0, r1.length);
	}
    @Test
	void R_w() {
        Rectangle r1 = new Rectangle(1.0,2.0);
        assertEquals(2.0, r1.width);
	}
    @Test
	void R_a() {
        Rectangle r1 = new Rectangle(1.0,2.0);
        assertEquals(2.0, r1.getArea());
	}
    @Test
	void R_p() {
        Rectangle r1 = new Rectangle(1.0,2.0);
        assertEquals(6.0, r1.getPeremeter());
	}
}
