package school.sptech;

public class TesteTermometroConstrutor {

    TermometroConstrutor term1 = new TermometroConstrutor();
    TermometroConstrutor term2 = new TermometroConstrutor();

    public static void main(String[] args) {
        System.out.println("=== Termômetro 1 ===");

        TermometroEncapsulado t1 = new TermometroEncapsulado();
        TermometroEncapsulado term1 = new TermometroEncapsulado();
        TermometroEncapsulado term2 = new TermometroEncapsulado();

        System.out.println(term1);
        System.out.println(term2);


        // Vantagens do encapsulamento

        term1.setTemperaturaAtual(10.0);
        term2.setTemperaturaMaxRegistrada(10.0);

        System.out.println("Temperatura atual term1: " + term1.getTemperaturaAtual());

        //Parâmetro válido oooh
        term1.aumentarTemperatura(-5.0);
        term1.aumentarTemperatura(null);

        System.out.println("Valores iniciais:");
        System.out.println(t1);

        t1.aumentarTemperatura(15.0);
        t1.aumentarTemperatura(10.0);
        System.out.println("\nApós aumentar temperatura duas vezes:");
        System.out.println(t1);

        t1.diminuirTemperatura(5.0);
        t1.diminuirTemperatura(25.0);
        System.out.println("\nApós diminuir temperatura duas vezes:");
        System.out.println(t1);

        System.out.println("\nTemperatura atual em Fahrenheit: " + t1.converterParaFahrenheit());

        // Segundo Termômetro
        System.out.println("\n=== Termômetro 2 ===");
        Termometro t2 = new Termometro();
        System.out.println("Valores iniciais:");
        System.out.println(t2);

        t2.aumentarTemperatura(20.0);
        t2.aumentarTemperatura(5.0);
        System.out.println("\nApós aumentar temperatura duas vezes:");
        System.out.println(t2);

        t2.diminuirTemperatura(10.0);
        t2.diminuirTemperatura(20.0);
        System.out.println("\nApós diminuir temperatura duas vezes:");
        System.out.println(t2);

        System.out.println("\nTemperatura atual em Fahrenheit: " + t2.converterParaFahrenheit());
        System.out.println();
    }
}
