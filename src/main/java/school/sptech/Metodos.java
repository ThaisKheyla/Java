package school.sptech;
import java.util.Scanner;

public class Metodos {
    public static void exibeAsteriscos() {
        System.out.println("************************");
    }

    // assinatura do metodo
    public static void exibeQuadradoAsteriscos() {
        exibeAsteriscos();
        System.out.println("***");
        exibeAsteriscos();
    }

    public static void exibeQuadradoAsteriscos(String msg) {
        exibeAsteriscos();
        System.out.println("***     " + msg + "     ***");
        exibeAsteriscos();
    }

//    public static Double media(Double n1, Double n2){
//
//        return (n1 + n2) / 2;
//    }
        public Double media(Double n1, Double n2){

        return (n1 + n2) / 2;
    }

    public static Double media(Double n1, Double n2, Double n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        exibeAsteriscos();
        System.out.println();
        exibeQuadradoAsteriscos();
        System.out.println();
        exibeQuadradoAsteriscos("Bom dia!");

        Metodos m = new Metodos();
        System.out.println(m.media(5.7, 6.5));
        Double media = (new Metodos()).media(8.9, 9.0);
        System.out.println();
        System.out.println(m.media(6.8, 7.0));     // média de 2 números
        System.out.println(media(7.0, 8.5, 9.5)); // média de 3 números

    }
}
