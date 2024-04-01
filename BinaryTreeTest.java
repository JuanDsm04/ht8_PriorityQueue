import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @autor Juan Solís
 * @description Clase para realizar pruebas unitarias a la clase BinaryTree
 * @version 1.0.0
 */

public class BinaryTreeTest {

    /**
     * @description Método que prueba el método add de la clase BinaryTree
     * Test hecho para no fallar
     */
    @Test
    public void testCorrectAdd() {
        BinaryTree<Paciente> tree = new BinaryTree<>();

        tree.add(new Paciente("Juan Pérez", "fractura de pierna", 'A'));
        tree.add(new Paciente("María García", "tratamiento de diabetes", 'B'));
        tree.add(new Paciente("Carlos Rodríguez", "dolores de espalda", 'C'));

        assertEquals("Juan Pérez", tree.getRoot().getData().getNombre());
        assertEquals("María García", tree.getRoot().getRight().getData().getNombre());
        assertEquals("Carlos Rodríguez", tree.getRoot().getRight().getRight().getData().getNombre());
    }

    /**
     * @description Método que prueba el método add de la clase BinaryTree
     * Test hecho para fallar
     */
    @Test
    public void testIncorrectAdd() {
        BinaryTree<Paciente> tree = new BinaryTree<>();

        tree.add(new Paciente("Juan Pérez", "fractura de pierna", 'A'));
        tree.add(new Paciente("María García", "tratamiento de diabetes", 'B'));
        tree.add(new Paciente("Carlos Rodríguez", "dolores de espalda", 'C'));

        assertEquals("Juan Pérez", tree.getRoot().getData().getNombre());
        assertEquals("Carlos Rogríguez", tree.getRoot().getRight().getData().getNombre());
        assertEquals("María García", tree.getRoot().getRight().getRight().getData().getNombre());
    }

    /**
     * @description Método que prueba el método remove de la clase BinaryTree
     * Test hecho para no fallar
     */
    @Test
    public void testCorrectRemove() {
        BinaryTree<Paciente> tree = new BinaryTree<>();

        tree.add(new Paciente("Juan Pérez", "fractura de pierna", 'A'));
        tree.add(new Paciente("María García", "tratamiento de diabetes", 'C'));
        tree.add(new Paciente("Carlos Rodríguez", "dolores de espalda", 'B'));

        assertEquals("Juan Pérez", tree.remove().getNombre());
        assertEquals("Carlos Rodríguez", tree.remove().getNombre());
        assertEquals("María García", tree.remove().getNombre());
        assertTrue(tree.isEmpty());
    }

    /**
     * @description Método que prueba el método remove de la clase BinaryTree
     * Test hecho para fallar
     */
    @Test
    public void testIncorrectRemove() {
        BinaryTree<Paciente> tree = new BinaryTree<>();

        tree.add(new Paciente("Juan Pérez", "fractura de pierna", 'A'));
        tree.add(new Paciente("María García", "tratamiento de diabetes", 'C'));
        tree.add(new Paciente("Carlos Rodríguez", "dolores de espalda", 'B'));

        assertEquals("Juan Pérez", tree.remove().getNombre());
        assertEquals("María García", tree.remove().getNombre());
        assertEquals("Carlos Rodríguez", tree.remove().getNombre());
        assertTrue(tree.isEmpty());
    }
}