/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */

/**
 * Esta clase representa un ítem individual del menú.
 */
public class Plato {
    // Atributos
    private int idPlato;
    private String nombre;
    private double precio;
    private String descripcion;
    private String categoria; // "plato fuerte", "bebida", etc.

    //Constructor

    public Plato(int idPlato, String nombre, double precio, String descripcion, String categoria) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    
    //Metodos set y get

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Descripcion del plato" +"\n"+  
                "idPlato: " + idPlato +"\n"+  
                "Nombre: " + nombre +"\n"+
                "Precio" + precio +"\n"+  
                "Descripción: " + descripcion +"\n"+  
                "Categoria: " + categoria;
    }
    
    
}