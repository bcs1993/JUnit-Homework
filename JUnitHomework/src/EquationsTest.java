import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {

    @Test
    void hypotenuseOfTriangle() {
        assertEquals(5, Equations.hypotenuseOfTriangle(0.0,4.0, 3.0));
    }

    @Test
    void areaOfTriangle() {
        assertEquals(3,Equations.areaOfTriangle(3,2));
    }

    @Test
    void circumferenceOfSphere() {
        assertEquals(25.132741228718345, Equations.circumferenceOfSphere(4));
    }
}