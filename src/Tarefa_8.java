import java.util.Scanner;

public class Tarefa_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaConsumo = 12.00;

        System.out.println("Qual a distância a ser percorrida em quilômetros? ");
        double Quilometros = scanner.nextDouble();

        double Consumo = Quilometros/mediaConsumo;
        double ConsumoAR = Math.round(Consumo*100.00)/100.00;

        System.out.println("A média de combustível que irá ser usada é: " + ConsumoAR);

        scanner.close();
    }
}
