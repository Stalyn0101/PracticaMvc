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
    private GestorTarea GestorTarea;
    private Tarea tarea;
    private tareaPendiente tareapendiente;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.GestorTarea = new GestorTarea();
        this.tarea = new tarea();
    }

    public void agregarTarea() {
        try {

            String titulo = vista.getitulo();
            String descripcion = vista.getdescripcion();
            if (titulo != null && descripcion != null) {
                tarea.setTitulo(titulo);
                tarea.setDescripcion(descripcion);
                GestorTarea.agregartarea(tarea);

            } else {
                Vista.Error();
            }
        } catch (Error e) {

        }
    }

    public void listarTarea() {
        Tarea[] tareas = GestorTarea.tareaCompleta();
        String tareasPendientes="";
            //convertir el vector en un String
            tareasPendientes=tareasPendientes+
        

        tareapendiente = new tareaPendiente();
        tareapendiente.mostrarPendientes(tareasPendientes);

    }
}

public class Controlador
    
    private Vista vista;
    private GestorTarea GestorTarea;
    private Tarea tarea;
    private tareaPendiente tareapendiente;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.GestorTarea = new GestorTarea();
        this.tarea = new Tareas();
    }

    /*public void porcesoGestorTareas(){
        /*si los datos estan correctos pasa al modelo
        caso contrario los devuelve a la vista
     */
    public void agregarTarea() {
        try {

            String titulo = vista.getTitulo();
            String descripcion = vista.getDescripcion();
            if (titulo != null && descripcion != null) {
                tarea.setTitulo(titulo);
                tarea.setDescripcion(descripcion);
                GestorTarea.agregarTarea(tarea);

            } else {
                vista.Error();
            }
        } catch (Error e) {

        }
    }
  
    public void listarTarea() {
        Tareas[] tareas = gestorTarea.TareaCompleta();
        String tareasPendientes="";
            //convertir el vector en un String
            tareasPendientes=tareasPendientes+
        

        pendiente = new Pendiente();
        pendiente.mostrarPendientes(tareasPendientes);

    }
}

public class Controlador 

    private Vista vista;
    private gestorTareas gestorTarea;
    private Tareas tarea;
    private Pendiente pendiente;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.gestorTarea = new gestorTareas();
        this.tarea = new Tareas();
    }

  
    public void agregarTarea() {
        try {

            String titulo = vista.getTitulo();
            String descripcion = vista.getDescripcion();
            if (titulo != null && descripcion != null) {
                tarea.setTitulo(titulo);
                tarea.setDescripcion(descripcion);
                gestorTarea.agregarTarea(tarea);

            } else {
                vista.Error();
            }
        } catch (Error e) {

        }
    }

    public void listarTarea() {
        Tareas[] tareas = gestorTarea.TareaCompleta();
        String tareasPendientes="";
        
        pendiente = new Pendiente();
        pendiente.mostrarPendientes(tareasPendientes);

    }
}

