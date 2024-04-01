/**
 * @autor Juan Solís
 * @description Clase que modela a un nodo dentro de un árbol binario
 * @version 1.0.0
 */

public class Nodo<T> {
    T data;
    Nodo<T> left;
    Nodo<T> right;

    /**
     * @description Constructor de la clase Nodo
     * @param data Dato que almacenará el nodo
     */
    public Nodo(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}