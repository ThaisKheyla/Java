package school.sptech;

import java.util.Scanner;
public class Termometro {
    double temperaturaAtual = 0.0;
    double temperaturaMaxRegistrada = 0.0;
    double temperaturaMinRegistrada = 0.0;

    public void aumentarTemperatura(Double valor) {
        if (valor == null || valor <= 0) {
            System.out.println("Parâmetro inválido");
            return;
        }
        temperaturaAtual += valor;
        if (temperaturaAtual > temperaturaMaxRegistrada) {
            temperaturaMaxRegistrada = temperaturaAtual;
        }
    }

    public void diminuirTemperatura(Double valor) {
        if (valor == null || valor <= 0) {
            System.out.println("Parâmetro inválido");
            return;
        }
        temperaturaAtual -= valor;
        if (temperaturaAtual < temperaturaMinRegistrada) {
            temperaturaMinRegistrada = temperaturaAtual;
        }
    }

    public double converterParaFahrenheit() {
        return temperaturaAtual * 1.8 + 32;
    }

    public static void main(String[] args){
        Termometro t1 = new Termometro();
        t1.aumentarTemperatura(10.0);
        t1.diminuirTemperatura(5.0);

        System.out.println("Temperatura em Fahrenheit: " + t1.converterParaFahrenheit());

        System.out.println("Estado atual do termômetro:");
        System.out.println(t1.toString());
    }
}