package school.sptech;

public class ContadorVariado {
    public static void main(String[] args) {
        for (Double valor = 0.15; valor < 5; valor += 0.15) {
            System.out.printf("%.2f\n", valor);
        }
    }
}
