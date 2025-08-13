package school.sptech;

import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args) {

        // Em Java, Strings são sequências de caracteres e são representadas como objetos.
        // Strings não são tipos primitivos, ao contrário dos tipos numéricos, como int, double, etc.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome1 = leitor.nextLine();  // Captura a entrada do usuário
        String nome2 = "Diego";  // String definida diretamente no código

        /*
         * Em Java, o operador `==` compara referências de objetos, não o conteúdo dos objetos.
         * Isso significa que, ao usar `==` para comparar Strings, você está verificando
         * se as duas variáveis referenciam o mesmo objeto na memória, e não se o conteúdo
         * dessas Strings é igual.
         *
         * Por isso, para comparar o conteúdo de Strings em Java, sempre use os métodos:
         * - `equals()` para comparação sensível a maiúsculas e minúsculas.
         * - `equalsIgnoreCase()` para comparação insensível a maiúsculas e minúsculas.
         */

        // Comparação insensível a maiúsculas e minúsculas
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais (ignora maiúsculas/minúsculas).");
        } else {
            System.out.println("Os nomes são diferentes.");
        }

        // Exemplo adicional: Comparação sensível a maiúsculas e minúsculas
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são exatamente iguais (considerando maiúsculas/minúsculas).");
        } else {
            System.out.println("Os nomes são diferentes ao considerar maiúsculas/minúsculas.");
        }

        /*
         * Por que isso não acontece com tipos numéricos:
         *
         * Tipos numéricos como int, double, float, etc., são tipos primitivos em Java.
         * Eles não são objetos, o que significa que o operador `==` compara os valores numéricos diretamente,
         * não referências de memória.
         *
         * Exemplo:
         * - Se `int a = 5` e `int b = 5`, a expressão `a == b` retornará `true` porque `==`
         *   está comparando os valores de `a` e `b`, não suas referências.
         *
         * Já para Strings, que são objetos, o operador `==` compara as referências dos objetos
         * (endereços de memória), e não o conteúdo das Strings.
         * Por isso, é importante usar `equals()` para comparar Strings.
         */

        // Exemplo: Comparação correta de números
        int numero1 = 5;
        int numero2 = 5;

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }

        /*
         * No exemplo acima, `numero1 == numero2` funciona corretamente porque `==`
         * compara diretamente os valores numéricos. Para tipos primitivos, isso é seguro e eficaz.
         *
         * Conclusão:
         * - Use `==` para comparar valores de tipos primitivos (int, double, etc.).
         * - Use `equals()` ou `equalsIgnoreCase()` para comparar o conteúdo de Strings.
         */
    }
}
