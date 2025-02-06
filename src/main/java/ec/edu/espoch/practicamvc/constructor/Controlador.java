/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.constructor;

import ec.edu.espoch.practicamvc.Vista.Vista;
import ec.edu.espoch.practicamvc.modelo.GestorTarea;
import ec.edu.espoch.practicamvc.modelo.Tarea;


/**
 *
 * @author HP
 */
public class Controlador {
    private Vista vista;
    private GestorTarea modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new GestorTarea();
    }

    public void procesoGestorTareas() {
        String titulo, descripcion, estado;

        try {
            titulo = vista.getNombreTarea();
            descripcion = vista.getDescripcionTarea();
            estado = vista.getEstadoSeleccionado(); 

            if (titulo.isEmpty() || descripcion.isEmpty() || estado.isEmpty()) {
                throw new Exception("Por favor complete todos los campos y seleccione un estado.");
            }

            modelo.agregarTarea(0, titulo, descripcion, true);

            vista.Error("Tarea registrada con éxito.");

        } catch (Exception e) {
            vista.Error("Error: " + e.getMessage());
        }
    }
}
