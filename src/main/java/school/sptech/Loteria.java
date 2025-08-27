package school.sptech;

import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        Integer numeroEscolhido = new Random().nextInt(11);
        Integer tentativas = 0;
        Integer numeroSorteado;
        System.out.println("Número escolhido: " + numeroEscolhido);
        do {
            numeroSorteado = new Random().nextInt(11);
            tentativas++;
            System.out.println("Número sorteado: " + numeroSorteado);
        } while (!numeroEscolhido.equals(numeroSorteado));

        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar.");
        }
    }
}
