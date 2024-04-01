/**
 * @autor Juan Solís
 * @description Clase que modela a un árbol binario
 * @version 1.0.0
 */

public class BinaryTree<T extends Comparable<T>> {
    private Nodo<T> root;

    /**
     * @description Constructor de la clase BinaryTree
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * @description Método que agrega un nuevo nodo al árbol binario
     * @param value Valor que almacenará el nodo
     */
    public void add(T value) {
        root = addRecursivo(root, value);
    }

    /**
     * @description Método que agrega un nuevo nodo al árbol binario de manera recursiva
     * @param current Nodo actual
     * @param value Valor que almacenará el nodo
     * @return Nodo que se agregó al árbol binario
     */
    private Nodo<T> addRecursivo(Nodo<T> current, T value) {
        if (current == null) {
            return new Nodo<>(value);
        }

        if (value.compareTo(current.data) <= 0) {
            current.left = addRecursivo(current.left, value);
        } else {
            current.right = addRecursivo(current.right, value);
        }

        return current;
    }

    /**
     * @description Método que elimina el nodo con el valor más pequeño del árbol binario
     * @return Valor del nodo eliminado
     */
    public T remove() {
        if (root == null) {
            return null;
        }

        T value = findMin(root);
        root = removeRecursivo(root, value);
        return value;
    }

    /**
     * @description Método que busca el valor más pequeño del árbol binario
     * @param node Nodo actual
     * @return Valor más pequeño del árbol binario
     */
    private T findMin(Nodo<T> node) {
        return node.left == null ? node.data : findMin(node.left);
    }

    /**
     * @description Método que elimina un nodo del árbol binario de manera recursiva
     * @param current Nodo actual
     * @param value Valor del nodo a eliminar
     * @return Nodo que se eliminó del árbol binario
     */
    private Nodo<T> removeRecursivo(Nodo<T> current, T value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.data) < 0) {
            current.left = removeRecursivo(current.left, value);
            
        } else if (value.compareTo(current.data) > 0) {
            current.right = removeRecursivo(current.right, value);

        } else {
            if (current.left == null) {
                return current.right;

            } else if (current.right == null) {
                return current.left;
            }

            current.data = findMin(current.right);
            current.right = removeRecursivo(current.right, current.data);
        }

        return current;
    }

    /**
     * @description Método que verifica si el árbol binario está vacío
     * @return true si el árbol binario está vacío, false en otro caso
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * @description Método que obtiene la raíz del árbol binario
     * @return Raíz del árbol binario
     */
    public Nodo<T> getRoot() {
        return root;
    }
}
