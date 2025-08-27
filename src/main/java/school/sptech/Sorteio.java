package school.sptech;

import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroEscolhido = new Random().nextInt(100) + 1;
        Integer primeiraPosicao = null;
        Integer pares = 0;
        Integer impares = 0;
        for (Integer i = 1; i <= 200; i++) {
            Integer sorteado = new Random().nextInt(100) + 1;
            if (sorteado.equals(numeroEscolhido) && primeiraPosicao == null) {
                primeiraPosicao = i;
            }
            if (sorteado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Número escolhido: " + numeroEscolhido);
        if (primeiraPosicao != null) {
            System.out.println("O número foi sorteado pela 1ª vez na posição: " + primeiraPosicao);
        } else {
            System.out.println("O número não foi sorteado nas 200 tentativas.");
        }
        System.out.println("Quantidade de números pares sorteados: " + pares);
        System.out.println("Quantidade de números ímpares sorteados: " + impares);
    }
}
