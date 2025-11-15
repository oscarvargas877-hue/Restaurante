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
        double precio = vista.getCampoPrecio();
        String descripcion = vista.getCampoDescripcion();
        String categoria = vista.getCategoria();
        
          //COMPROBAR LOS DATOS INGRESADOS POR EL USUARIO
          if(nombre.isEmpty()||descripcion.isEmpty()||categoria.isEmpty()){
              vista.mostrarMensaje("Todos los campos son obligatorios");
              return;   
            }
          if(precio<=0){
              vista.mostrarMensaje("El precio debe ser mayor a cero");
              return;
            }
    //SIT TODO ESTA CORRECTO INICIALIZAMOS EL MODELO
    Plato plato1 = new Plato(nombre,precio,descripcion,categoria);
        vista.setCampoResultado(plato1.toString());
    
          
    }
    public void iniciar(){
          // 1. Asignar el Controlador como oyente a los botones de la Vista
        vista.getCampoGuardar().addActionListener(e -> generarPlato());
              // 2. Mostrar la Vista
              vista.setVisible(true);
    }
  
    
    
}
