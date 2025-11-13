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
 * Esta clase representa a un USUARIO de la aplicación.
 * Contiene sus datos personales y métodos para interactuar con la app.
 */
public class Cliente {
    // Atributos: Son las "características" del cliente
    private int idCliente; // Un número único para identificar al cliente
    private String nombre; // El nombre del cliente
    private String email; // Su correo electrónico
    private String contrasenia; // Su contraseña
    private String telefono; // Su número de teléfono

    //Constructor

    public Cliente(int idCliente, String nombre, String email, String contrasenia, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
    }
    
    //Metodos set  y get 

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasena) {
        this.contrasenia = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Datos del cliente"+"\n"+  
                "idCliente: " + idCliente +"\n"+  
                "Nombre: " + nombre +"\n"+  
                "Email: " + email +"\n"+  
                "Contraseña: " + contrasenia +"\n"+  
                "Teléfono: " + telefono ;
                
    }
    
    
}