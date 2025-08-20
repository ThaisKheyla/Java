package school.sptech;

public class TesteCarro {
    public static void main(String[] args) {
        //Instanciando a classe Carro
        Carro fusca = new Carro();

        fusca.anoFabricacao = 2025;
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.velocidade = 0.0;

        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();

        System.out.println("Velocidade atual: " + fusca.velocidade);
        fusca.frear();

        System.out.println("Velocidade atual: " + fusca.velocidade);

        fusca.colidir();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        System.out.println(fusca);

        fusca.acelerar();
        //Instanciar um novo objeto da classe carro
        Carro meuSonho = new Carro();
        meuSonho.modelo = "Ferrari";
        meuSonho.velocidade = 0.0;
        meuSonho.anoFabricacao = 2025;
        meuSonho.cor = "Vermelho";


        System.out.println("Velocidade");

        Carro fusca2 = new Carro();
        fusca2.anoFabricacao = 1979;
        fusca2.velocidade = 0.0;
        fusca2.modelo = "fusquita";
        fusca2.cor = "rosa";

        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        
        if (fusca == fusca2) {
            System.out.println("s iguais");
        } else {
            System.out.println("n são iguais");
        }
    }
}