import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @autor Juan Solís
 * @description Clase que modela a un lector de archivos
 * @version 1.0.0
 */
public class Lector {

    /**
     * @description Método que lee un archivo de texto y almacena los pacientes en una PriorityQueue
     * @param nombreArchivo Nombre del archivo que se desea leer
     * @return PriorityQueue con los pacientes del archivo
     */
    public PriorityQueue<Paciente> leerPacientesPriorityQueue(String nombreArchivo) {
        PriorityQueue<Paciente> priorityQueue = new PriorityQueue<>();

        try {
            File file = new File(nombreArchivo);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");

                if (parts.length == 3) {
                    String nombre = parts[0];
                    String caso = parts[1];
                    char prioridad = parts[2].charAt(0);
                    Paciente paciente = new Paciente(nombre, caso, prioridad);
                    priorityQueue.add(paciente);
                }

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Ocurrió un error, el archivo con los pacientes no fue encontrado");
            System.exit(0);
        }
        return priorityQueue;
    }

    /**
     * @description Método que lee un archivo de texto y almacena los pacientes en un BinaryTree (implementación propia)
     * @param nombreArchivo Nombre del archivo que se desea leer
     * @return BinaryTree con los pacientes del archivo
     */
    public BinaryTree<Paciente> leerPacientesBinaryTree(String nombreArchivo) {
        BinaryTree<Paciente> binaryTree = new BinaryTree<>();

        try {
            File file = new File(nombreArchivo);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");

                if (parts.length == 3) {
                    String nombre = parts[0];
                    String caso = parts[1];
                    char prioridad = parts[2].charAt(0);
                    Paciente paciente = new Paciente(nombre, caso, prioridad);
                    binaryTree.add(paciente);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Ocurrió un error, el archivo con los pacientes no fue encontrado");
            System.exit(0);
        }
        return binaryTree;
    }
}