import java.util.Scanner;

public class Tarefa_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em dólares: ");
        double Valor = scanner.nextDouble();

        double Conversor = Valor * 3.80;

        System.out.println("A conversão para reais será: " + "R$" + Conversor);

        scanner.close();
    }
}
