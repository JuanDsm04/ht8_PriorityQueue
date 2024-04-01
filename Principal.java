import java.util.Scanner;
import java.util.PriorityQueue;

/**
 * @autor Juan Solís
 * @description Clase principal del programa
 * @version 1.2.0
 */

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcion;

        System.out.println("Estructuras de datos");
        System.out.println("1. Implementación personalizada");
        System.out.println("2. PriorityQueue (Java Collection Framework)");
        System.out.print("Ingrese la implementación que desea utilizar: ");
        opcion = input.nextLine();

        switch (opcion) {
            case "1":
                programaConImplementacionPropia();
                break;

            case "2":
                programaConImplementacionJava();
                break;

            default:
                System.out.println("Opción no válida, por defector se utilizará la implementación personalizada");
                programaConImplementacionPropia();
        }

        input.close();
    }

    public static void programaConImplementacionPropia (){
        Lector lector = new Lector();
        String opcion;
        boolean repetirMenu = true;
        Scanner input = new Scanner(System.in);

        BinaryTree<Paciente> binaryTree = lector.leerPacientesBinaryTree("pacientes.txt");

            while (repetirMenu) {
                System.out.println("\nMenu:");
                System.out.println("1. Siguiente paciente");
                System.out.println("2. Terminar programa");
                System.out.print("Seleccione una opción: ");
                opcion = input.nextLine();

                switch (opcion) {
                    case "1":
                        if (!binaryTree.isEmpty()) {
                            Paciente siguiente = binaryTree.remove();
                            System.out.println("Paciente atendido: " + siguiente);

                        } else {
                            System.out.println("No hay pacientes en espera");
                        }
                        break;

                    case "2":
                        System.out.println("Programa finalizado");
                        repetirMenu = false;
                        break;

                    default:
                        System.out.println("La opción seleccionada no es válida");
                }
            }
        input.close();
    }

    public static void programaConImplementacionJava(){
        Lector lector = new Lector();
        String opcion;
        boolean repetirMenu = true;
        Scanner input = new Scanner(System.in);

        PriorityQueue<Paciente> priorityQueue = lector.leerPacientesPriorityQueue("pacientes.txt");

            while (repetirMenu) {
                System.out.println("\nMenu:");
                System.out.println("1. Siguiente paciente");
                System.out.println("2. Terminar programa");
                System.out.print("Seleccione una opción: ");
                opcion = input.nextLine();

                switch (opcion) {
                    case "1":
                        if (!priorityQueue.isEmpty()) {
                            Paciente siguiente = priorityQueue.poll();
                            System.out.println("Paciente atendido: " + siguiente);

                        } else {
                            System.out.println("Ya no hay pacientes en espera");
                        }
                        break;

                    case "2":
                        System.out.println("Programa finalizado");
                        repetirMenu = false;
                        break;

                    default:
                        System.out.println("La opción seleccionada no es válida");
                }
            }
        input.close();
    }
}