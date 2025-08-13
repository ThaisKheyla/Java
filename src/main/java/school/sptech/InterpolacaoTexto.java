package school.sptech;

public class InterpolacaoTexto {
    public static void main(String[] args) {
        /*
         * Em Java, podemos usar especificadores de formato com o método String.format() ou o método formatted()
         * para inserir variáveis dentro de uma string de forma mais legível e controlada.
         *
         * Especificadores de formato comuns:
         *
         * - %s  : String (texto)
         * - %d  : Inteiro (decimal)
         * - %f  : Número de ponto flutuante (float/double)
         * - %.2f: Número de ponto flutuante com 2 casas decimais
         * - %x  : Inteiro em hexadecimal
         * - %o  : Inteiro em octal
         * - %b  : Boolean (true/false)
         * - %c  : Caractere único
         * - %%  : Sinal de porcentagem (%)
         *
         * Exemplo de uso:
         * String.format("Texto: %s, Número: %d, Valor: %.2f", "Hello", 42, 3.14159);
         * Resultado: "Texto: Hello, Número: 42, Valor: 3.14"
         */

        // Exemplo de variáveis
        String filme = "Titanic";
        int anoLancamento = 1997;
        double bilheteria = 2.195;  // Em bilhões de dólares

        // 1. Concatenação de Strings usando o operador (+) - má prática
        String frase1 = "Nome do filme: " + filme
                + ", Ano de lançamento: " + anoLancamento
                + ", Bilheteria: $" + bilheteria + " bilhões";
        System.out.println("Concatenação com +: " + frase1);

        // 2. Usando String.format
        String frase2 = String.format(
                "Nome do filme: %s, Ano de lançamento: %d, Bilheteria: $%.2f bilhões",
                filme,
                anoLancamento,
                bilheteria
        );
        System.out.println("String.format: " + frase2);

        // 3. Usando o método formatted (Java 15+)
        String frase3 = "Nome do filme: %s, Ano de lançamento: %d, Bilheteria: $%.2f bilhões"
                .formatted(filme, anoLancamento, bilheteria);
        System.out.println("Método formatted: " + frase3);

        // 4. Usando Text Blocks (Java 13+)
        String textoMaior = """
                Filme: %s
                    - Ano de lançamento: %d
                    - Bilheteria: $%.2f bilhões
                """.formatted(filme, anoLancamento, bilheteria);

        System.out.println("Text Block formatted:\n" + textoMaior);

        // 5. Usando StringBuilder para construção dinâmica de strings
        StringBuilder sb = new StringBuilder();
        sb.append("Filme: ").append(filme)
                .append("\nAno de lançamento: ").append(anoLancamento)
                .append("\nBilheteria: $").append(String.format("%.2f bilhões", bilheteria));

        System.out.println("StringBuilder:\n" + sb.toString());
    }
}
