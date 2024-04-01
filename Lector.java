import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @autor Juan Solís
 * @description Clase que modela a un lector de archivos
 * @version 1.0.0
 */
public class Lector {

    /**
     * @description Método que lee un archivo de texto y almacena los pacientes en un árbol binario
     * @param nombreArchivo Nombre del archivo que se desea leer
     * @return Árbol binario con los pacientes leídos
     */
    public BinaryTree<Paciente> leerPacientes(String nombreArchivo) {
        BinaryTree<Paciente> priorityQueue = new BinaryTree<>();

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
            System.err.println("Ocurrió un error, el archivo no fue encontrado");
        }
        return priorityQueue;
    }
}