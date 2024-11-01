package listas;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> frutas = new ArrayList<>();
        ArrayList <String> feira = new ArrayList<>();
        frutas.add ("Banana");
        frutas.add ("Laranja");
        frutas.add ("Melancia");
        frutas.add ("Uva");

        //remover elementos
        frutas.remove(1);

        //consulta elementos de maneira direta
        System.out.println(frutas.get(0));

        //consulta o tamanho da lista
        System.out.println("O tamanho da lista de frutas é de: "+frutas.size()+" itens");
        System.out.println("O tamanho da lista feira é de: "+frutas.size()+" itens");

        //verifica se está vazia
        System.out.println("a lista está vazia: "+frutas.isEmpty());
        System.out.println("a lista está vazia: "+feira.isEmpty());

        //percorrendo uma lista
        System.out.println("Lista de frutas: ");
        for(String item: frutas){
            System.out.println(item);
        }
    }
}
