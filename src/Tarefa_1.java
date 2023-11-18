import java.util.Scanner;

public class Tarefa_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String Nome = scanner.nextLine();

        System.out.println("Qual o seu sexo? ");
        String Sexo = scanner.nextLine();

        System.out.println("Seu nome é: " + Nome + " e seu sexo é: " + Sexo);

        scanner.close();
    }    
}
