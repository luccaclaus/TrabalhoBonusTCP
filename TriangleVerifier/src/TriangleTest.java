import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    
    @Test
    public void isEquilatero() {
        int ladoA = 3;
        int ladoB = 3;
        int ladoC = 3;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.equilatero, result);
    }

    @Test
    public void isIsoceles() {
        int ladoA = 3;
        int ladoB = 3;
        int ladoC = 3;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.isoceles, result);
    }

}
