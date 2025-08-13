package school.sptech;

import java.util.Scanner;

public class InputUsuario {

    public static void main(String[] args) {
        /*
         * Em Python, você pode capturar a entrada do usuário com algo como:
         * numero = int(input('Digite um numero'))
         *
         * Em Java, usamos a classe Scanner para capturar a entrada do usuário (input).
         * O Scanner é usado para ler dados do console (stdin), mas é importante entender como ele lida com diferentes tipos de dados.
         */

        // Criando um objeto do tipo Scanner para capturar a entrada do usuário
        Scanner leitor = new Scanner(System.in);
        Scanner leitoNl = new Scanner(System.in);

        /*
         * Scanner.nextInt() e Scanner.nextLine() - Comportamento Importante:
         *
         * Quando você usa Scanner.nextInt() ou qualquer outro método que captura um número,
         * o Scanner lê o número, mas não consome a nova linha (Enter) que o usuário digita após o número.
         * Isso significa que, se você tentar capturar uma String logo após capturar um número,
         * o Scanner pode parecer "pular" a entrada da String, porque ele captura o Enter residual.
         */

        // Exemplo de captura de um número inteiro
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();  // Captura o número, mas deixa o Enter no buffer

        /*
         * Como a leitura do número com nextInt() deixa o Enter no buffer,
         * precisamos limpar o buffer antes de capturar a próxima linha de texto.
         * Para isso, usamos leitor.nextLine() logo após a captura do número.
         */

        // Exemplo de captura de uma String
        System.out.println("Digite seu nome:");  // Solicita o nome do usuário
        String nomeDigitado = leitoNl.nextLine();  // Captura a linha completa de texto

        // Exibindo a entrada do usuário
        System.out.println("Olá " + nomeDigitado
                + ", sua idade é: " + idadeDigitada);

        /*
         * Leitura de múltiplos números em uma única linha:
         *
         * O Scanner pode ler vários números em sequência, separados por espaços, em uma única linha de entrada.
         * Isso pode ser útil em situações onde você precisa capturar múltiplos valores rapidamente.
         *
         * Exemplo:
         * - O usuário digita: "10 20 30 40"
         * - O Scanner pode ler cada número individualmente usando nextInt() repetidamente.
         */

        System.out.println("Digite quatro números separados por espaço:");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int num4 = leitor.nextInt();

        System.out.println("Números digitados: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);

        /*
         * Notas:
         * - A captura de múltiplos números funciona bem quando eles são separados por espaços ou quebras de linha.
         * - Se houver mais números na linha do que o esperado, você pode continuar usando nextInt() para capturar os próximos valores.
         * - Se quiser capturar a linha completa primeiro, pode usar nextLine() e então processar os números usando parse (e.g., Integer.parseInt()).
         */

        // Outros métodos úteis do Scanner:
        // - next() captura a próxima palavra (delimitada por espaço ou Enter).
        // - nextDouble(), nextFloat(), nextLong(), etc., para capturar outros tipos numéricos.
    }
}
