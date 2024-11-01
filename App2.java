package listas;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class App2 {
    public static void main(String[] args) throws Exception {
        //lista_encadeada();
        Listacircular playlist = new Listacircular();
        playlist.adicionar("Dani California - Red Hot Chilli Peppers");
        playlist.adicionar("Californication - Red Hot Chilli Peppers");
        playlist.adicionar("Can't stop - Red Hot Chilli Peppers");
        playlist.adicionar("Dark necessities - Red Hot Chilli Peppers");
        playlist.adicionar("By the way- Red Hot Chilli Peppers");
        playlist.adicionar("Tell me baby - Red Hot Chilli Peppers");
        playlist.adicionar("Zephir song - Red Hot Chilli Peppers");
        playlist.adicionar("My friends- Red Hot Chilli Peppers");
        playlist.adicionar("the adventures of rain dance maggie - Red Hot Chilli Peppers");
        playlist.adicionar("under the bridge - Red Hot Chilli Peppers");

        playlist.percorrer(4);


    }

    public static void lista_encadeada(){
        LinkedList<String> carros = new LinkedList<>();

        carros.add("Corsa");
        carros.add("Gol");
        carros.add("HB20");
        carros.add("Onix");

        carros.remove();
        System.out.println("listar carros removidos");
        System.out.println(carros.toString());

        carros.removeFirst();
        System.out.println("listar carros removidos");
        System.out.println(carros.toString());

        carros.removeFirst();
        System.out.println();

        carros.removeLast();
        System.out.println("listar carros removidos");
        System.out.println(carros.toString());

        

        carros.addFirst("Kwid");
        System.out.println("Listar carros");
        System.out.println(carros.toString());

        carros.addLast("Argo");
        System.out.println("Listar carros");
        System.out.println(carros.toString());


        //consultar um elemento em especifico
        System.out.println("Acesso direto:"+carros.get(0));
        System.out.println("Acesso o 1º item da lista:"+carros.getFirst());
        System.out.println("Acesso o ultimo item da lista:"+carros.getLast());

        System.out.println("Percorrendo uma lista do inicio ao fim");
        ListIterator<String> it = carros.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("percorrendo uma lista do fim ao inicio");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }


}

 