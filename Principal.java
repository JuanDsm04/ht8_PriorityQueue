import java.util.Scanner;

/**
 * @autor Juan Solís
 * @description Clase principal del programa
 * @version 1.0.0
 */

public class Principal {
    public static void main(String[] args) {
        Lector lector = new Lector();
        BinaryTree<Paciente> priorityQueue = lector.leerPacientes("pacientes.txt");
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Siguiente paciente");
            System.out.println("2. Terminar programa");
            System.out.print("Seleccione una opcion: ");
            opcion = input.nextLine();

            switch (opcion) {
                case "1":
                    if (!priorityQueue.isEmpty()) {
                        Paciente siguiente = priorityQueue.remove();
                        System.out.println("Paciente atendido: " + siguiente);

                    } else {
                        System.out.println("No hay pacientes en espera");
                    }
                    break;

                case "2":
                    System.out.println("Programa finalizado");
                    continuar = false;
                    break;

                default:
                    System.out.println("La opción seleccionada no es válida");
            }
        }

        input.close();
    }
}