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
    private static int idPlato;
    private String nombre;
    private double precio;
    private String descripcion;
    private String categoria; // "plato fuerte", "bebida", etc.

    //Constructor

    public Plato() {
         idPlato++;
    }
    

    public Plato( String nombre, double precio, String descripcion, String categoria) {
        this(); // llama al constructor vacío para asignar ID
        this.nombre = nombre;// Ejemplo: "Arroz con pollo", "Ceviche", "Lomo saltado"
        this.precio = precio;
        this.descripcion = descripcion;// Ejemplo: "Arroz blanco con pollo a la plancha, cebolla y ají"
        this.categoria = categoria;// Ejemplo: "Plato fuerte", "Bebida", "Postre", "Entrada", "Sopa"
    }
    
    //Metodos set y get

    public static int getIdPlato() {
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