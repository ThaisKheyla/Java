import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner leitorCalorias = new Scanner(System.in);

        Integer tempoAquecendo = 0;
        Integer tempoExercicios = 0;
        Integer tempoMusculacao = 0;

        System.out.println("Insira quantos minutos ficou se aquecendo: ");
        tempoAquecendo = leitorCalorias.nextInt();

        System.out.println("Insira quantos minutos ficou fazendo sua musculação: ");
        tempoExercicios = leitorCalorias.nextInt();

        System.out.println("Insira quantos minutos ficou fazendo sua musculação: ");
        tempoMusculacao = leitorCalorias.nextInt();

        Integer caloriasAquecimento = 12;
        Integer caloriasExercicios = 20;
        Integer caloriasMusculacao = 25;

        Integer perdaTotalCalorias = tempoAquecendo * caloriasAquecimento + tempoExercicios * caloriasExercicios + tempoMusculacao * caloriasMusculacao;
        Integer minutosTotal = tempoAquecendo + tempoExercicios + tempoMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + minutosTotal + "  minutos de exercícios e perdeu cerca de " + perdaTotalCalorias + " calorias.");


    }
}
