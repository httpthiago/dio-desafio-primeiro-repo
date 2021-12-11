package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("PARTE 1 - OPERAÇÕES BÁSICAS");
        System.out.printf("Soma: %.2f\n", Solucao.somar(2, 3));
        System.out.printf("Subtração: %.2f\n", Solucao.subtrair(13, 5));
        System.out.printf("Multiplicação: %.2f\n", Solucao.multiplicar(4, 25));
        System.out.printf("Divisão: %.2f\n",Solucao.dividir(500, 3));
        System.out.println("-----------------------------------------------------");
        System.out.println("PARTE 2 - CUMPRIMENTO NA HORA ADEQUADA DO DIA");
        double horaDodia = 23;
        Solucao.cumprimentar(horaDodia);
        System.out.println("-----------------------------------------------------");
        System.out.println("PARTE 3 - CALCULAR EMPRÉSTIMO");
        double valor = 1000;
        int parcelas = 3;
        Solucao.calcularValorFinal(valor, parcelas);
    }
}
