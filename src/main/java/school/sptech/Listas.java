import java.util.ArrayList;
import java.util.List;

public class Listas{
    public static void main(String[] args) {
        // Criação das listas
        List<String> lista = new ArrayList<>();
        List<Integer> listaNumero = new ArrayList<>();
        List listaloka = new ArrayList(); //  Object


        // Adicionando nomes
        lista.add("Mickey");
        lista.add("Pateta");
        lista.add("Thais");

        // Adicionando números
        listaNumero.add(10);
        listaNumero.add(5);
        listaNumero.add(9);

        System.out.println("Lista de números: " + listaNumero);

        // Remove o elemento do índice 1
        listaNumero.remove(1);
        System.out.println("Depois de remover índice 1: " + listaNumero);

        // Verifica se "Pateta" está na lista
        System.out.println("Pateta está na lista? " + lista.contains("Pateta"));

        // Índice de "Minnie" (não existe, retorna -1)
        System.out.println("Índice da Minnie: " + lista.indexOf("Minnie"));

        System.out.println();

        // Adicionando valores na lista loka
        listaloka.add(100);
        listaloka.add("sptech");
        listaloka.add(200.5);
        listaloka.add(false);
        System.out.println("Lista loka: " + listaloka);

        // Mostra o tamanho da lista de nomes
        System.out.println("Tamanho da lista de nomes: " + lista.size());

        // Exibindo com for tradicional
        System.out.println("Exibindo com for tradicional:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Adiciona na posição 0
        lista.add(0, "Disney");
        System.out.println("Depois de add(0, 'Disney'): " + lista);

        // Remove elemento pelo nome
        lista.remove("Mickey");
        System.out.println("Depois de remover 'Mickey': " + lista);

        // Remove elemento pelo índice
        lista.remove(0);
        System.out.println("Depois de remover posição 0: " + lista);
    }
}
