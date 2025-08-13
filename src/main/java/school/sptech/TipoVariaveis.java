package school.sptech;

public class TipoVariaveis {
    public static void main(String[] args) {
        /*
         * Tipos de dados em Java
         *
         * Classes Wrapper:
         * - São classes que encapsulam os tipos primitivos, permitindo que sejam tratados como objetos.
         * - Oferecem métodos utilitários adicionais e podem ser usados em coleções como listas, onde tipos primitivos não são permitidos.
         *
         * Exemplos de Classes Wrapper:
         * - String: Representa texto, sempre declarado entre aspas duplas. Exemplo: "texto"
         * - Integer: Representa números inteiros. Exemplo: 10
         * - Double: Representa números de ponto flutuante de precisão dupla. Exemplo: 1.83
         * - Boolean: Representa valores lógicos, ou seja, true ou false.
         * - Character: Representa um único caractere, sempre entre aspas simples. Exemplo: 'a'
         * - Long: Representa números inteiros maiores, usando 64 bits. Exemplo: 100000L
         * - Float: Representa números de ponto flutuante de precisão simples, menor que Double. Exemplo: 1.23f
         *
         * Tipos primitivos:
         * - São os tipos de dados mais básicos em Java, usados para armazenar valores simples.
         * - Não possuem métodos ou funcionalidades adicionais como as classes wrapper.
         *
         * Exemplos de Tipos Primitivos:
         * - int: Tipo primitivo para números inteiros. Exemplo: 10
         * - double: Tipo primitivo para números de ponto flutuante de precisão dupla. Exemplo: 1.83
         * - boolean: Tipo primitivo para valores lógicos. Exemplo: true ou false
         * - char: Tipo primitivo para caracteres. Exemplo: 'a'
         * - long: Tipo primitivo para números inteiros maiores. Exemplo: 100000L
         * - float: Tipo primitivo para números de ponto flutuante de precisão simples. Exemplo: 1.23f
         *
         * Observação:
         * - String não possui um tipo primitivo equivalente, é sempre tratada como uma classe em Java.
         */

        // Exemplo de uso de uma classe wrapper Integer
        Integer numeroInteiro1 = 10;  // Integer é a classe wrapper para o tipo primitivo int
        String string = numeroInteiro1.toString();  // Convertendo o Integer para String usando o método toString()

        // Exemplo de uso de um tipo primitivo int
        int numeroInteiroPrimitivo = 10;  // int é o tipo primitivo para números inteiros

        // String é uma classe usada para representar texto
        String nome = "Diego Brito";  // String é uma classe, não um tipo primitivo

        // Exemplo de uso de uma classe wrapper Double
        Double altura = 1.83;  // Double é a classe wrapper para o tipo primitivo double

        // Exemplo de uso de uma classe wrapper Boolean
        Boolean isMaiorDeIdade = true;  // Boolean é a classe wrapper para o tipo primitivo boolean

        /*
         * Java usa tipagem estática, ou seja, o tipo de uma variável é definido no momento da declaração e não pode ser alterado.
         * JavaScript, por outro lado, utiliza tipagem dinâmica, onde o tipo da variável pode mudar em tempo de execução.
         */

        String nomeTeste;  // Variável declarada, mas sem valor inicial
        nomeTeste = "Diego Brito";  // Atribuição de valor à variável

        // Uso de "var" em Java (disponível a partir do Java 10)
        // O tipo é inferido pelo compilador com base no valor atribuído
        var testeVar = "Diego Brito";  // Inferido como String
        // var teste;  // Isso não funciona, pois o tipo não pode ser inferido sem uma atribuição inicial
    }
}
