package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        double areaQuadrado = Quadrilatero.calcularArea(5);
        double areaRetangulo = Quadrilatero.calcularArea(10, 5);
        double areaTrapezio = Quadrilatero.calcularArea(5, 4, 2);

        System.out.println("Area quadrado: " + areaQuadrado);
        System.out.println("Area retângulo: " + areaRetangulo);
        System.out.println("Area trapézio: " + areaTrapezio);
    }
}
