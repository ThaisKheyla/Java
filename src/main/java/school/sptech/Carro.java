package school.sptech;

public class Carro {
    //Definir os atributos (Variáveis que são criadas dentro da classe , mas fora do escopo dos metodos )
    // São usadas para represekntar as caracteristicas do objeto que sao relevantes para o projeto

    String modelo;
    Double velocidade;
    String cor;
    Integer anoFabricacao;

    // Metodos -  representam o comportamento do objeto

    // Metodo acelerar
    public void acelerar() {
        System.out.println("ran dan dan dan dan");
        velocidade += 20;
    }
    public void frear() {
        System.out.println("Freando ...");
        velocidade -=20;
    }
    // Metodo colidir
    public void colidir(){
        System.out.println("CRAShhhhhhh");
        velocidade = 0.0;

    }
    //sobreescrever o metodo tostring()


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}