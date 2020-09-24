package proyecto_deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author fnang
 */
public class Proyecto_Deque {

    public void pila() {
        Deque<String> pila = new ArrayDeque<>();
        pila.push("Entro primero");
        pila.push("Entro segundo");
        pila.push("Entro tercero");
        
        
        
        System.out.println("==PILA==");
        
        System.out.println(pila.toString());
        int size = pila.size() - 1;
        while (size >= 0) {
            System.out.println(pila.pop());
            size--;
        }
        
        System.out.println(pila.toString());
    }

    public void cola() {
        Deque<String> cola = new ArrayDeque<>();
        cola.add("Entro primero");
        cola.add("Entro segundo");
        cola.add("Entro tercero");

        System.out.println("==COLA==");
        int size = cola.size() - 1;
        while (size >= 0) {
            System.out.println(cola.remove());
            size--;
        }
    }
}
