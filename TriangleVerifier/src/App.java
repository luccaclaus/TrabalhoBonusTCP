import java.util.Scanner;

enum TriangleTypes {
    isoceles,
    escaleno,
    equilatero
}
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("Insira os lados do triângulo (separados por espaço):");
            
        int ladoA = scn.nextInt();
        int ladoB = scn.nextInt();
        int ladoC = scn.nextInt();

        Triangle triangle = new Triangle(ladoA, ladoB, ladoC);

        if (triangle.isTriangle()) {
            triangle.triangleType();
        } 

        scn.close();
    }
}
