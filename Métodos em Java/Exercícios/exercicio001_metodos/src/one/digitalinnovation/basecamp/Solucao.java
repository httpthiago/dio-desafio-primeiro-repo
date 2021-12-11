package one.digitalinnovation.basecamp;

public class Solucao {

    // parte 1 da solução (calcular operações básicas)
    public static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public static double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }

    public static double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }

    public static double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }

    // parte 2 da solução (mensagem adequada segundo a hora do dia)
    public static void cumprimentar(double horaDoDia){
        if(horaDoDia < 13) {
            System.out.println("Bom dia!");
        } else if(horaDoDia < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }

    //parte 3 da solução
    public static void calcularValorFinal(double valor, int parcelas){
        double taxa = 0;
        if(parcelas == 2) {
            taxa = 0.2;
            valor = valor + (valor * taxa);
            System.out.println("Valor final: " + valor);
        } else if(parcelas == 3) {
            taxa = 0.5;
            valor = valor + (valor * taxa);
            System.out.println("Valor final: " + valor);
        } else {
            System.out.println("Parcela inválida");
        }
    }
}
