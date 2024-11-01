package listas;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

public class Listacircular {
    private LinkedList <String> lista;
    public Listacircular(){
        lista = new LinkedList<>();
    }

    public void adicionar (String item){
        lista.add(item);
    }

    public void remover (String item){
        lista.remove(item);
    }

    public void percorrer(int loops){
        if(lista.isEmpty()){
            System.out.println("A lista está vazia");
            return;
        }
        ListIterator<String> it = lista.listIterator();
        int contador = 0;
        while(contador<loops){
            if(!it.hasNext()){
                    it = lista.listIterator();
            }
            System.out.println(it.next());
            contador++;
        }

    }
}
