package one.digitalinnovation.basecamp;

public class Quadrilatero {
    public static void calcularArea(double lado){
        double area = lado * lado;
        System.out.println("A área deste quadrado é: " + area);
    }

    public static void calcularArea(double base, double altura){
        double area = base * altura;
        System.out.println("A área deste retângulo é: " + area);
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        double area = ( (baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área deste trapézio é de: " + area);
    }
}
