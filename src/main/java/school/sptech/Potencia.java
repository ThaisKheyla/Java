package school.sptech;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        System.out.print("Digite a base (inteiro positivo): ");
        Integer base = leitor.nextInt();

        System.out.print("Digite o expoente (inteiro positivo): ");
        Integer expoente = leitor.nextInt();
        
        Integer resultado = 1;
        for (Integer i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
        leitor.close();
    }
}
