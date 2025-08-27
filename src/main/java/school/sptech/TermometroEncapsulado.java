package school.sptech;

public class TermometroEncapsulado {
    private double temperaturaAtual = 0.0;
    private double temperaturaMaxRegistrada = 0.0;
    private double temperaturaMinRegistrada = 0.0;

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

    @Override
    public String toString() {
        return "Temperatura Atual: " + temperaturaAtual +
                "\nTemperatura Máxima Registrada: " + temperaturaMaxRegistrada +
                "\nTemperatura Mínima Registrada: " + temperaturaMinRegistrada;
    }

    //Getters e Setters
    // alt + insert

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaNova) {
        this.temperaturaAtual = temperaturaNova;
    }

    public double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public void setTemperaturaMaxRegistrada(double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }

    public double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    public void setTemperaturaMinRegistrada(double temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }
}

