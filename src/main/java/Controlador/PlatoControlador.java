/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.PlatoVista;
import modelo.Plato;

/**
 *
 * @author Usuario
 */
public class PlatoControlador {
    //ATRIBUTOS 
    private Plato modelo;
    private PlatoVista vista;
    
    //CONSTRUCTORES

    public PlatoControlador() {
    }

    public PlatoControlador(Plato modelo, PlatoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    //METODOS
    public void generarPlato(){
        //RECUPERAR LA INFORMACION DEL FRONTEND
        String nombre = vista.getCampoNombre();
        String precioTexto = vista.getPrecioTexto();
        String descripcion = vista.getCampoDescripcion();
        String categoria = vista.getCategoria();
        
      // VALIDAR CAMPOS VACÍOS PRIMERO (antes de convertir nada)
        if (nombre.isEmpty() || descripcion.isEmpty() || categoria.isEmpty() || precioTexto.isEmpty()) {
            vista.mostrarMensaje("Todos los campos son obligatorios. ¡No deje espacios en blanco!");
            return;
        }

        // CONVERTIR PRECIO CON SEGURIDAD
        double precio;
        try {
            precio = Double.parseDouble(precioTexto);
        } catch (NumberFormatException e) {
            vista.mostrarMensaje("El precio debe ser un número válido (ejemplo: 15.50)");
            return;
        }

        // VALIDAR PRECIO POSITIVO
        if (precio <= 0) {
            vista.mostrarMensaje("El precio debe ser mayor a cero");
            return;
        }
        //SI TODO ESTA CORRECTO INICIALIZAMOS EL MODELO
        Plato plato1 = new Plato(nombre,precio,descripcion,categoria);
        vista.setCampoResultado(plato1.toString());
    
          
    }
    public void iniciar(){
          // 1. Asignar el Controlador como oyente a los botones de la Vista
        vista.getCampoGuardar().addActionListener(e -> generarPlato());
              // 2. Mostrar la Vista
              vista.setVisible(true);
    }

    public void borrarCampos() {
        vista.borrarCampos();  // Llama al método de la vista que limpia los campos
        vista.mostrarMensaje("¡Todos los campos han sido borrados!");    }
  
    
    
}
