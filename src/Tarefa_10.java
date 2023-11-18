import java.util.Scanner;

public class Tarefa_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor devido: ");
        double Valor = scanner.nextDouble();

        System.out.println("O valor da taxa: ");
        double Taxa = scanner.nextDouble();

        System.out.println("Dias que se passaram: ");
        double Dias = scanner.nextDouble();

        double Calculo = Valor + (Valor*(Taxa/100)*Dias);

        System.out.println("O valor devido é: " + Calculo);

        scanner.close();
    }
}
