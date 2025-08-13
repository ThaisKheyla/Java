package school.sptech;

// Usamos PascalCase para nomear classes em Java
public class Condicionais {

    /*
     * Todo projeto Java precisa ter pelo menos um método `main`,
     * que é o ponto de entrada (entrypoint) da aplicação.
     * Em projetos reais, geralmente usamos apenas um método `main`,
     * localizado na classe principal da aplicação.
     */
    public static void main(String[] args) {

        /*
         * Operadores em Java:
         * - =  : Atribuição (ex: int x = 10; atribui o valor 10 à variável x)
         * - == : Igualdade (ex: x == 10 verifica se x é igual a 10)
         * - != : Diferente de (ex: x != 10 verifica se x é diferente de 10)
         * - >  : Maior que (ex: x > 5 verifica se x é maior que 5)
         * - <  : Menor que (ex: x < 5 verifica se x é menor que 5)
         * - >= : Maior ou igual (ex: x >= 5 verifica se x é maior ou igual a 5)
         * - <= : Menor ou igual (ex: x <= 5 verifica se x é menor ou igual a 5)
         * - && : AND lógico (ex: x > 5 && x < 10 verifica se x está entre 5 e 10)
         * - || : OR lógico (ex: x < 5 || x > 10 verifica se x é menor que 5 ou maior que 10)
         * - !  : NOT lógico (ex: !isMaiorDeIdade inverte o valor booleano de isMaiorDeIdade)
         *
         * Operadores de incremento e decremento:
         * - ++ : Incrementa o valor da variável em 1 (ex: x++)
         * - -- : Decrementa o valor da variável em 1 (ex: x--)
         *
         * Operadores compostos:
         * - += : Adiciona e atribui (ex: x += 5 é o mesmo que x = x + 5)
         * - -= : Subtrai e atribui (ex: x -= 5 é o mesmo que x = x - 5)
         * - *= : Multiplica e atribui (ex: x *= 5 é o mesmo que x = x * 5)
         * - /= : Divide e atribui (ex: x /= 5 é o mesmo que x = x / 5)
         *
         * Operadores aritméticos:
         * - *  : Multiplicação (ex: x * 2)
         * - /  : Divisão (ex: x / 2)
         * - +  : Adição (ex: x + 2)
         * - -  : Subtração (ex: x - 2)
         * - %  : Módulo (resto da divisão) (ex: x % 2 retorna o resto da divisão de x por 2)
         * - ** : Não existe em Java; usamos Math.pow(base, expoente) para exponenciação.
         */

        // Exemplo básico de condicionais
        Integer idade = 31;

        // Operador ternário - é uma forma simplificada de um if-else
        String resultadoFormatado = idade >= 18 ? "É maior de idade" : "Não é maior de idade";
        System.out.println("Resultado usando operador ternário: " + resultadoFormatado);

        // Outra forma de usar condicionais: if-else
        Boolean isMaiorDeIdade = idade >= 18;
        if (isMaiorDeIdade) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }

        // Exemplo de encadeamento de if-else
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // Exemplo de switch-case
        Integer opcao = 1;  // Troque o valor para testar diferentes cases

        /*
         * O switch-case é uma alternativa ao uso de vários if-else encadeados,
         * quando se está verificando o valor de uma única variável.
         *
         * Tipos de dados que podem ser usados com switch-case:
         * - int, byte, short, char: Tipos primitivos inteiros e caractere.
         * - String: A partir do Java 7, o switch-case suporta Strings.
         * - enum: Muito comum em Java, enums podem ser usados diretamente em switch-case.
         * - Integer, Byte, Short, Character: Classes Wrapper dos tipos primitivos mencionados acima.
         * - Nota: `long`, `float`, `double` e `boolean` não podem ser usados diretamente em switch-case.
         */
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;
            default:
                System.out.println("Opção inválida. Escolha um número entre 1 e 3.");
                break;  // O break no default é opcional, mas pode ser útil para manter a consistência.
        }

    }
}
