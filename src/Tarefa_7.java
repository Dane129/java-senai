import java.util.Scanner;

public class Tarefa_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números: ");
        double Valor_1 = scanner.nextDouble();
        double Valor_2 = scanner.nextDouble();
        double Valor_3 = scanner.nextDouble();

        double Media = (Valor_1 + Valor_2 + Valor_3) / 3;
        double MediaAR = Math.round(Media*100.00)/100.00;

        System.out.println("A média é: " + MediaAR);

        scanner.close();
    }
}
