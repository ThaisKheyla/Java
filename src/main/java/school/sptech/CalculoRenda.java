import java.util.Scanner;

public class CalculoRenda {
    public static void main(String[] args) {
        System.out.println("1 - Cálculo de Renda");

        Scanner scanner = new Scanner(System.in);

        Integer filhosDe0a3 = 0;
        Integer filhosDe4a16 = 0;
        Integer filhosDe17a18 = 0;

        System.out.println("Digite a quantidade de filhos de 0 a 3 anos: ");
        filhosDe0a3 = scanner.nextInt();

        System.out.println("Digite a quantidade de filhos de 4 a 16 anos: ");
        filhosDe4a16 = scanner.nextInt();

        System.out.println("Digite a quantidade de filhos de 17 e 18 anos: ");
        filhosDe17a18 = scanner.nextInt();

        Double bolsa1 = 25.12;
        Double bolsa2 = 15.88;
        Double bolsa3 = 12.44;

        Double totalBolsa = filhosDe0a3 * bolsa1 + filhosDe4a16 * bolsa2 + filhosDe17a18 * bolsa3;

        Integer totalFilhos = filhosDe0a3 + filhosDe4a16 + filhosDe17a18;

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$" + String.format("%.2f", totalBolsa) + " de bolsa");

    }
}
