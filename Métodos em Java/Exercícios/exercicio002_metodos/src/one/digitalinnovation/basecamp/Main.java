package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //área quadrado: método calcularArea com um parâmetro (lado)
        Quadrilatero.calcularArea(5);
        //área retângulo: método calcularArea com dois parâmetros (base, altura)
        Quadrilatero.calcularArea(50, 10);
        //área trapézio: método calcularArea com três parâmetros (baseMaior, baseMenor, altura)
        Quadrilatero.calcularArea(2, 4, 8);
    }
}
