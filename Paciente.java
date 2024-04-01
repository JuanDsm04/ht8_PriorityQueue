/**
 * @autor Juan Solís
 * @description Clase que modela a un paciente dentro del programa
 * @version 1.0.0
 */

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String caso;
    private char prioridad;

    /**
     * @description Constructor de la clase Paciente
     * @param nombre Nombre del paciente
     * @param caso Razón por la cuál el paciente acude a la sección de Emergencias de un hospital
     * @param prioridad Prioridad del paciente en la lista de espera para ser atendido
     */
    public Paciente(String nombre, String caso, char prioridad) {
        this.nombre = nombre;
        this.caso = caso;
        this.prioridad = prioridad;
    }

    /**
     * @description Método que retorna el nombre del paciente
     * @return Nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @description Método que asigna un nombre al paciente
     * @param nombre Nombre del paciente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @description Método que retorna el caso por el cuál el paciente acude a la sección de Emergencias de un hospital
     * @return Caso del paciente
     */
    public String getCaso() {
        return caso;
    }

    /**
     * @description Método que asigna un caso al paciente
     * @param caso Caso del paciente
     */
    public void setCaso(String caso) {
        this.caso = caso;
    }

    /**
     * @description Método que retorna la prioridad del paciente en la lista de espera para ser atendido
     * @return Prioridad del paciente
     */
    public char getPrioridad() {
        return prioridad;
    }

    /**
     * @description Método que asigna una prioridad al paciente
     * @param prioridad Prioridad del paciente
     */
    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @description Método que compara a dos pacientes por su prioridad
     * @param paciente Paciente con el que se comparará al primer paciente
     */
    @Override
    public int compareTo(Paciente paciente) {
        return Character.compare(this.prioridad, paciente.prioridad);
    }

    /**
     * @description Método que devuelve un String con la información de un paciente
     * @return Representación de un paciente en forma de String
     */
    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Caso: " + caso + ", Prioridad: " + prioridad;
    }
}