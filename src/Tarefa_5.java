import java.util.Scanner;

public class Tarefa_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double Salario = scanner.nextDouble();

        double Aumento = Salario * 0.15;
        Salario += Aumento;

        System.out.println("O salário com o aumento de 15% será: R$" + Salario);

        scanner.close();
    }    
}
