/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Usuario
 */

/**
 * Esta clase representa la lista de platos que ofrece un restaurante.
 */
public class Menu {
    // Atributos
    private int idMenu; // Identificador del menú
    private String nombre; // Nombre del menú (p. ej. "Menú infantil")
    private String descripcion; // Descripción del menú
    private List<Plato> listaPlatos; // Aquí está: una LISTA de objetos Plato

    //Constructor 

    public Menu(int idMenu, String nombre, String descripcion, List<Plato> listaPlatos) {
        this.idMenu = idMenu;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaPlatos = listaPlatos;
    }
    
        //Metodo set y get

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    @Override
    public String toString() {
        return "Menu del restaurante"+"\n"+  
                "idMenú: " + idMenu +"\n"+  
                "Nombre: " + nombre +"\n"+  
                "Descripción: " + descripcion +"\n"+  
                "Lista de los platos: " + listaPlatos;
                
                
    }
    
    
    
    
}