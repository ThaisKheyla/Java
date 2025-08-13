package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {

        /*
         * Em JavaScript, para gerar um número randômico entre 0 e 10, usamos:
         * Math.random() * 10
         *
         * Em Java, também existe o método Math.random(), que gera um número de ponto flutuante entre 0.0 e 1.0.
         * Mas em Java, temos outras opções mais flexíveis e poderosas, como as classes Random e ThreadLocalRandom.
         */

        // Usando a classe Random para gerar números aleatórios
        Random aleatorio = new Random();  // Instância de Random para gerar números randômicos

        // Gerando um número inteiro aleatório entre 0 (inclusivo) e 20 (exclusivo)
        // O método nextInt() com dois parâmetros (min e max) está disponível no Java 17+
        // Para versões anteriores, seria necessário calcular o valor desejado.
        Integer i = aleatorio.nextInt(20);  // Gera um número aleatório entre 0 (inclusivo) e 20 (exclusivo)

        /*
         * A classe ThreadLocalRandom é uma alternativa mais eficiente em situações onde
         * múltiplas threads geram números aleatórios de forma independente.
         * Não precisa de sincronização como a classe Random e pode ser mais rápida em ambientes concorrentes.
         */

        // Usando ThreadLocalRandom para gerar números inteiros aleatórios
        Integer j = ThreadLocalRandom.current()
                .nextInt(0, 20);  // Gera um número aleatório entre 0 (inclusivo) e 20 (exclusivo)

        // Usando ThreadLocalRandom para gerar números de ponto flutuante aleatórios
        Double numeroDouble = ThreadLocalRandom.current()
                .nextDouble(0.5, 42.2);  // Gera um número aleatório entre 0.5 (inclusivo) e 42.2 (exclusivo)

        // Imprimindo os valores gerados
        System.out.println("Número inteiro gerado com Random: " + i);
        System.out.println("Número inteiro gerado com ThreadLocalRandom: " + j);
        System.out.println("Número double gerado com ThreadLocalRandom: " + numeroDouble);

        /*
         * Resumo:
         * - Random: Classe para gerar números aleatórios. Bom para uso geral, mas pode não ser eficiente em ambientes multithread.
         * - ThreadLocalRandom: Melhor performance em aplicações multithread. Ideal para geração de números aleatórios em threads individuais.
         *
         * Ambos são mais flexíveis que Math.random() em JavaScript, que apenas gera números de ponto flutuante entre 0 e 1.
         */
    }
}
