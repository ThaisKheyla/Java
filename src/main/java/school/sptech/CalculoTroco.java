import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double valorUnitario = 0.0;
        Integer quantidadeVendida = 0;
        Double valorClienteRecebido = 0.0;

        System.out.println("Insira o valor unitário do produto: ");
        valorUnitario = leitor.nextDouble();

        System.out.println("Insira o total de quantidades vendidas: ");
        quantidadeVendida = leitor.nextInt();

        System.out.println("Insira o valor que será pago pelo cliente: ");
        valorClienteRecebido = leitor.nextDouble();

        Double valorTotal = valorClienteRecebido - (quantidadeVendida * valorUnitario);

        System.out.println("Seu troco será de R$ " + valorTotal);
    }
}
