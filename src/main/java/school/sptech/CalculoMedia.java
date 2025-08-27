package school.sptech;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        String nome = "";
        Double nota1 = 0.0;
        Double nota2 = 0.0;


        System.out.println("Insira o nome do aluno: ");
        nome = leitorS.nextLine();

        System.out.println("Insira a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();

        System.out.println("Insira a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();

        Double media = (nota1 + nota2) / 2;

        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
    }
}
