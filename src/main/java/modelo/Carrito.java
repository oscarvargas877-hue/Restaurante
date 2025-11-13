/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;  // Importamos la clase List para poder usar listas
/**
 *
 * @author Usuario
 */

/**
 * Esta clase representa el carrito de compras del cliente.
 */
public class Carrito {
    // Atributos
    // Aquí está otra vez: una LISTA de objetos Plato
    private List<Plato> listaPlatos;//Representa los platos que el cliente ha agregado al carrito.
    private double total;//Sirve para mostrarle al cliente cuánto va a pagar antes de confirmar el pedido.
    private int cantidadItems; // Sirve para indicarle al cliente cuántos productos tiene en su carrito

    //Constructor

    public Carrito(List<Plato> listaPlatos, double total, int cantidadItems) {
        this.listaPlatos = listaPlatos;
        this.total = total;
        this.cantidadItems = cantidadItems;
    }
    
    //Metodos set y get

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(int cantidadItems) {
        this.cantidadItems = cantidadItems;
    }

    @Override
    public String toString() {
        return "Datos del carrito"+"\n"+
                "Lista de los platos: " + listaPlatos +"\n"+
                "Total: " + total +"\n"+
                "Cantidad de items: " + cantidadItems; 
    }
    
 
}