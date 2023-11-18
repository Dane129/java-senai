import java.util.Scanner;

public class Tarefa_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int Valor = scanner.nextInt();

        int Ant = Valor - 1;
        int Suc = Valor + 1;

        System.out.println("O valor antecessor é: " + Ant + " e o valor sucessor é: " + Suc);

        scanner.close();
    }
}
