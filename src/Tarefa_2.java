import java.util.Scanner;

public class Tarefa_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros: ");
        int Valor_1 = scanner.nextInt();
        int Valor_2 = scanner.nextInt();
        int Valor_3 = scanner.nextInt();
        int Valor_4 = scanner.nextInt();

        int Soma = Valor_1 + Valor_2 + Valor_3 + Valor_4;
        int Mult = Valor_1 * Valor_2 * Valor_3 * Valor_4;

        System.out.println("A soma é: " + Soma);
        System.out.println("A multiplicação é: " + Mult);
        
        scanner.close();
    }    
}
