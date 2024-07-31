public class Triangle {
    
    int ladoA;
    int ladoB;
    int ladoC;

    public Triangle(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    };

    public void isTriangle() {
        if ((ladoA + ladoB > ladoC) && (ladoC + ladoB > ladoA) && (ladoA + ladoC > ladoB)) {
            System.out.println("Os lados inseridos formam um triângulo corretamente.");
            this.triangleType();
        } else {
            System.out.println("Os valores inseridos não formam um triângulo.");
        }
    };

    private void triangleType() {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triângulo é equilátero.");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("O triângulo é isóceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        };
    };
}
