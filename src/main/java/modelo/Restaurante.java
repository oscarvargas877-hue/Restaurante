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
 * Esta clase representa un lugar donde se hacen los pedidos.
 * Contiene sus datos y métodos relacionados con su menú.
 */
public class Restaurante {
    // Atributos del restaurante
    private int idRestaurante;
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario;

    //Constructor

    public Restaurante(int idRestaurante, String nombre, String direccion, String telefono, String horario) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
    }
    //Metodos set y get

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Información del restaurante" +"\n"+ 
                "idRestaurante: " +idRestaurante  +"\n"+  
                "Nombre: " + nombre +"\n"+  
                "dirección: : "+ direccion  +"\n"+  
                "Teléfono: " + telefono  +"\n"+  
                "Horario: " + horario;
    }
    
}