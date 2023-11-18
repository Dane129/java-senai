import java.util.Scanner;

public class Tarefa_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double Numero = scanner.nextDouble();

        System.out.println("O próprio número: " + Numero);
        System.out.println("O quadrado deste número: " + (Numero * Numero));
        System.out.println("A raíz quadrada desde número: " + (Math.sqrt(Numero)));

        scanner.close();
    }
}
