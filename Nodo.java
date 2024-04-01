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

    /**
     * @description Método que obtiene el dato almacenado en el nodo
     * @return Dato almacenado en el nodo
     */
    public T getData() {
        return data;
    }

    /**
     * @description Método que establece el dato almacenado en el nodo
     * @param data Dato que se almacenará en el nodo
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @description Método que obtiene el nodo izquierdo
     * @return Nodo izquierdo
     */
    public Nodo<T> getLeft() {
        return left;
    }

    /**
     * @description Método que establece el nodo izquierdo
     * @param left Nodo izquierdo
     */
    public void setLeft(Nodo<T> left) {
        this.left = left;
    }

    /**
     * @description Método que obtiene el nodo derecho
     * @return Nodo derecho
     */
    public Nodo<T> getRight() {
        return right;
    }

    /**
     * @description Método que establece el nodo derecho
     * @param right Nodo derecho
     */
    public void setRight(Nodo<T> right) {
        this.right = right;
    }
}