
public class Triangle {
    
    int ladoA;
    int ladoB;
    int ladoC;

    public Triangle(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    };

    public boolean isTriangle() {
        if ((ladoA + ladoB > ladoC) && (ladoC + ladoB > ladoA) && (ladoA + ladoC > ladoB)) {
            System.out.println("Os lados inseridos formam um triângulo corretamente.");
            return true;
        } else {
            System.out.println("Os valores inseridos não formam um triângulo.");
            return false;
        }
    }

    public TriangleTypes triangleType() {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triângulo é equilátero.");
            return TriangleTypes.equilatero;
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("O triângulo é isóceles.");
            return TriangleTypes.isoceles;
        } else {
            System.out.println("O triângulo é escaleno.");
            return TriangleTypes.escaleno;
        }
    };
}
