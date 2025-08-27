package school.sptech;

import java.util.Random;

public class Votacao {
    public static void main(String[] args) {
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        for (Integer i = 0; i < 10; i++) {
            Integer voto = new Random().nextInt(3) + 1;
            if (voto.equals(1)) {
                mussarela++;
            } else if (voto.equals(2)) {
                calabresa++;
            } else {
                quatroQueijos++;
            }
        }
        System.out.println("Mussarela: " + mussarela);
        System.out.println("Calabresa: " + calabresa);
        System.out.println("Quatro Queijos: " + quatroQueijos);
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("Sabor favorito: Mussarela");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("Sabor favorito: Calabresa");
        } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
            System.out.println("Sabor favorito: Quatro Queijos");
        } else {
            System.out.println("Houve empate entre os sabores.");
        }
    }
}
