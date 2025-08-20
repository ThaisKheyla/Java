package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    // Método que exibe os valores de um vetor
    public static void exibeVetor(Integer[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(); // pula linha no final
    }

    // Método que lê os valores do vetor
    public static void leVetor(Integer[] vetor, Scanner leitor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do vetor[" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Criando vetor de tamanho 8
        Integer[] vetor = new Integer[8];

        // Criando vetor já preenchido
        Integer[] vetor2 = {100, 200, 300, 400, 500};

        // Dois vetores de nomes
        String[] nome = new String[5];   // vazio (vai imprimir nulls)
        String[] nome2 = {"Ana", "Bia", "Carlos", "Diego", "Eva"}; // já preenchido

        Double[] numero1 = new Double[6]; // ainda não usado

        // For enhanced percorre todos os elementos de nome2
        System.out.println("\nPercorrendo nome2:");
        for(String n : nome2){
            System.out.println(n);
        }

        // Preenche o vetor com valores digitados
        leVetor(vetor, leitor);

        // Exibe os vetores
        System.out.println("\nvetor2: ");
        exibeVetor(vetor2);

        System.out.println("\nvetor preenchido pelo usuário: ");
        exibeVetor(vetor);

        // Coloca em colchetes estilo lista
        System.out.println("\nEm formato de lista: " + Arrays.toString(vetor));

        leitor.close(); // boa prática
    }
}
