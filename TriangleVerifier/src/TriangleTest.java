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
    public void isIsocelesAB() {
        int ladoA = 3;
        int ladoB = 3;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.isoceles, result);
    }

    @Test
    public void isIsocelesBC() {
        int ladoA = 4;
        int ladoB = 3;
        int ladoC = 3;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.isoceles, result);
    }

    @Test
    public void isIsocelesAC() {
        int ladoA = 3;
        int ladoB = 4;
        int ladoC = 3;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.isoceles, result);
    }

    @Test
    public void isEscalena() {
        int ladoA = 3;
        int ladoB = 2;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        TriangleTypes result = triangle.triangleType();

        assertEquals(TriangleTypes.escaleno, result);
    }

    @Test
    public void hasZeroAsSideA() {
        int ladoA = 0;
        int ladoB = 2;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }
    
    @Test
    public void hasZeroAsSideB() {
        int ladoA = 3;
        int ladoB = 0;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test
    public void hasZeroAsSideC() {
        int ladoA = 3;
        int ladoB = 2;
        int ladoC = 0;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideAIsNegative() {
        int ladoA = -3;
        int ladoB = 2;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideBIsNegative() {
        int ladoA = 3;
        int ladoB = -2;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideCIsNegative() {
        int ladoA = 3;
        int ladoB = 2;
        int ladoC = -4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideSumABEqualsSideC() {
        int ladoA = 2;
        int ladoB = 2;
        int ladoC = 4;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideSumACEqualsSideB() {
        int ladoA = 2;
        int ladoB = 4;
        int ladoC = 2;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }
    
    @Test 
    public void sideSumBCEqualsSideA() {
        int ladoA = 4;
        int ladoB = 2;
        int ladoC = 2;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideSumABLessThanSideC() {
        int ladoA = 2;
        int ladoB = 2;
        int ladoC = 7;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideSumBCLessThanSideA() {
        int ladoA = 7;
        int ladoB = 2;
        int ladoC = 2;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void sideSumACLessThanSideB() {
        int ladoA = 2;
        int ladoB = 7;
        int ladoC = 2;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

    @Test 
    public void allSidesAreZero() {
        int ladoA = 0;
        int ladoB = 0;
        int ladoC = 0;

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        boolean result = triangle.isTriangle();

        assertEquals(false, result);
    }

}
