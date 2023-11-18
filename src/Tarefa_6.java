import java.util.Scanner;

public class Tarefa_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double Temperatura = scanner.nextDouble();

        double Conversor = (Temperatura - 32)*5/9;
        double Arredondado = Math.round(Conversor*100.00)/100.00;

        System.out.println("A temperatura em graus Celcius é: " + Arredondado);

        scanner.close();
    }
}
