package school.sptech;

import java.util.Random;

public class Acumulador {
    public static void main(String[] args) {
        Integer soma = 0;
        Integer numeroSorteado;
        do {
            numeroSorteado = new Random().nextInt(11);
            if (!numeroSorteado.equals(0)) {
                soma += numeroSorteado;
            }
        } while (!numeroSorteado.equals(0));
        System.out.println("A soma dos números é " + soma);
    }
}
