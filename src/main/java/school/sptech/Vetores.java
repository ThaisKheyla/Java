package school.sptech;

import java.util.Scanner;

public class Vetores {

    // Método que exibe os valores de um vetor
    public static void exibeVetor(Integer[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(); // pula linha no final
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Criando vetor de tamanho 8
        Integer[] vetor = new Integer[8];

        // Criando vetor já preenchido
        Integer[] vetor2 = {100, 200, 300, 400, 500};

        // Preenche o vetor com valores digitados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do vetor[" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        // Exibe os vetores
        System.out.println("\nvetor2: ");
        exibeVetor(vetor2);

        System.out.println("\nvetor preenchido pelo usuário: ");
        exibeVetor(vetor);

        leitor.close(); // boa prática, fecha o Scanner
    }
}
