/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.modelo;

/**
 *
 * @author HP
 */
public class GestorTarea {
    
    private final Tarea [] tareas;
    private int contadorTareas;

    public GestorTarea() {
        tareas = new Tarea[10];
        contadorTareas = 0;
    }

   
        public void agregarTarea(int id, String titulo, String descripcion, boolean tareaCompletada) {
    if (contadorTareas < tareas.length) {
        tareas[contadorTareas] = new Tarea(id, titulo, descripcion);
        System.out.println("Tarea añadida: " + id + " - " + titulo + " - " + descripcion + " - Completada: " + tareaCompletada);  // Espacios añadidos para mejor legibilidad
        contadorTareas++;
        } else {
            System.out.println("No se pueden agregar mas tareas.");
        }
    }

    public void isCompletada() {
        System.out.println("Tareas Pendientes");
        for (int i = 0; i < contadorTareas; i++) {
            if (tareas[i].isCompletada()) {
                System.out.println(i + "; " + tareas[i].getDescripcion());

            }

        }
    }

    public void isCompleta() {
        System.out.println("Tareas Completadas");
        for (int i = 0; i < contadorTareas; i++) {
            if (!tareas[i].isCompletada()) {

            } else {
            }
        }
    }

    public Tarea[] listarTareasCompletadas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Tarea[] listarTareasPendientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
