package school.sptech;

public class LacosRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de repetição em Java são usados para executar um bloco de código repetidamente com base em uma condição.
         * Em JavaScript, usamos estruturas similares. Abaixo, faremos uma comparação entre os laços de repetição em Java e JavaScript.
         *
         * Exemplo de um loop "for" em JavaScript:
         * for (var i = 0; i <= 10; i++) {
         *     // código a ser repetido
         * }
         *
         * Em Java, a diferença principal é que precisamos declarar explicitamente o tipo de variável,
         * já que Java usa tipagem estática (diferente de JavaScript, que usa tipagem dinâmica).
         */

        // Exemplo de um laço "for" em Java
        // Esse laço começa com i=10 e vai decrementando até que i seja igual a 0
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + "\n");  // Imprime o valor de i e quebra a linha
        }

        /*
         * Laço "for" infinito:
         * Em Java, assim como em JavaScript, você pode criar um loop infinito omitindo a condição de parada.
         * Esse tipo de loop pode ser perigoso se você não definir uma condição de saída adequada.
         */
//        Integer contador = 0;
//        for (;;) {  // Laço infinito
//            contador++;
//            System.out.println("Número: " + contador);  // Imprime o contador
//            // Normalmente, aqui haveria uma condição para sair do loop, como:
//            // if (contador == 100) break;
//        }

        /*
         * Laço "while":
         * O laço "while" executa o bloco de código enquanto a condição for verdadeira.
         * Em JavaScript, seria algo como:
         * while (condicao) {
         *     // código a ser repetido
         * }
         *
         * Em Java, a sintaxe é quase idêntica.
         */
        Integer contador = 0;  // Inicializa o contador
        while (contador < 10) {  // Executa enquanto contador for menor que 10
            System.out.println("Contador: " + contador);  // Imprime o valor do contador
            // O incremento do contador foi comentado, então o loop seria infinito sem ele
            contador++;  // Incrementa o contador para evitar um loop infinito
        }

        /*
         * Laço "while" infinito:
         * Assim como o laço "for", o "while" também pode ser infinito se a condição nunca for falsa.
         * Um exemplo típico seria:
         */
//        while (true) {  // Laço infinito
//            // código a ser repetido indefinidamente
//            // Normalmente, haveria uma condição para sair do loop, como:
//            // if (algumaCondicao) break;
//            break;  // Apenas para evitar que o exemplo realmente entre em loop infinito
//        }

        /*
         * Laço "do-while":
         * O laço "do-while" é semelhante ao "while", mas a condição é verificada após a execução do bloco de código.
         * Isso significa que o bloco de código será executado pelo menos uma vez, independentemente da condição.
         * Em JavaScript, seria algo assim:
         * do {
         *     // código a ser repetido
         * } while (condicao);
         *
         * A sintaxe em Java é a mesma.
         */
        contador = 0;  // Reinicializa o contador
        do {
            System.out.println("Do-While Contador: " + contador);  // Imprime o valor do contador
            contador++;  // Incrementa o contador
        } while (contador < 10);  // Executa enquanto contador for menor que 10

        /*
         * Exemplo adicional de "for":
         * Um "for" clássico que imprime os números de 1 a 5.
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        /*
         * Exemplo adicional de "while":
         * Um "while" que decrementa o valor de um contador até 0.
         */
        contador = 5;
        while (contador > 0) {
            System.out.println("Contagem regressiva: " + contador);
            contador--;
        }

        /*
         * Exemplo adicional de "do-while":
         * Um "do-while" que pede ao usuário para inserir um valor até que seja maior que 10.
         * (Esse exemplo seria ideal com entrada de usuário, mas vamos simplificar)
         */
        contador = 0;
        do {
            System.out.println("Tentativa: " + contador);
            contador++;
        } while (contador <= 3);  // Executa enquanto o contador for menor ou igual a 3
    }
}
